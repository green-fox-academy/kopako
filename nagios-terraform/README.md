# This is about how to create an AWS EC2 running Nagios monitor with one host in it.

## Content
1. [Prerequisites](#prerequisites)

### Prerequisites

AWS_CLI, Terraform and Git installed and credentials configured

### Step 1

Clone current repo and go inside folder _nagios-terraform_

### Step 2

You need to create a [key-pair](https://eu-west-3.console.aws.amazon.com/ec2/v2/home?region=eu-west-3#KeyPairs:sort=keyName) at Paris with arbitrary name (if you want change nothing - name it <Kopako-keys> without angle quotation brackets).
Edit variables.tf
```terraform
default = "Kopako-keys"  ===> default = "YourKeyPair"
```
Save YourKeyPair.pem to the home directory. The path is important.

### Step 3

Run command:
```sh
terraform apply
yes
```
The instance should be created at Paris location.

### Step 4

Go to the public ip of instance. If you are inspective you may seen ip in a stdout when terraform was trying to establish the connection to the instance:
```
Connecting to remote host via SSH...
aws_instance.nagios (remote-exec):   Host: 35.180.31.147
aws_instance.nagios (remote-exec):   User: ubuntu
aws_instance.nagios (remote-exec):   Password: false
aws_instance.nagios (remote-exec):   Private key: true
aws_instance.nagios (remote-exec):   SSH Agent: true
aws_instance.nagios (remote-exec):   Checking Host Key: false
```

### Step 5

Log in to the nagios with
user: nagiosadmin
Password: nagios

### Step 6

Restart nagios:
go to _Process info_
you should be able to find the restart link there

# Congratulation
