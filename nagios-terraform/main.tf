provider "aws" {
  region = "eu-west-3"
}

resource "aws_instance" "nagios" {
  tags {
    Name = "Nagios-docker-malachite"
  }

  ami           = "ami-08182c55a1c188dee"
  instance_type = "t2.micro"

  security_groups = [
    "Kopako-security",
  ]

  key_name = "${var.key_name}"

  connection {
    user        = "${var.key_user}"
    type        = "ssh"
    private_key = "${file("~/${var.key_name}.pem")}"
  }

  provisioner "remote-exec" {
    inline = [
      "sudo apt-get update",
      <<EOF
      sudo apt-get install -y \
        apt-transport-https \
        ca-certificates \
        curl \
        gnupg-agent \
        software-properties-common
EOF
      ,
      "curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -",
      <<EOF
      sudo add-apt-repository \
        "deb [arch=amd64] https://download.docker.com/linux/ubuntu \
        $(lsb_release -cs) \
        stable"
EOF
      ,
      "sudo apt-get update",
      "sudo apt-get install -y docker-ce docker-ce-cli containerd.io",
      <<EOF
      sudo docker run --name nagios4  \
        -v ~/nagios/etc/:/opt/nagios/etc/ \
        -v ~/nagios/var:/opt/nagios/var/ \
        -v ~/nagios-custom-plugins:/opt/Custom-Nagios-Plugins/ \
        -v ~/nagiosgraph-var:/opt/nagiosgraph/var/ \
        -v ~/nagiosgraph-etc:/opt/nagiosgraph/etc/ \
        -d -p 0.0.0.0:80:80 jasonrivers/nagios:latest
EOF
      ,
    ]
  }

  provisioner "file" {
    source      = "${var.cfg_file}"
    destination = "${var.cfg_file}"
  }

  provisioner "remote-exec" {
    inline = [
      "sudo mv ${var.cfg_file} nagios/etc/conf.d/${var.cfg_file}",
    ]
  }
}

resource "aws_security_group" "Kopako-security" {
  name        = "Kopako-security"
  description = "Used for Monitor service"

  # SSH access from anywhere
  ingress {
    from_port   = 22
    to_port     = 22
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  # HTTP access from anywhere
  ingress {
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  # outbound internet access
  egress {
    from_port   = 0
    to_port     = 0
    protocol    = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }
}
