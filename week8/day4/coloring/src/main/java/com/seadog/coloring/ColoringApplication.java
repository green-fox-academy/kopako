package com.seadog.coloring;

import com.seadog.coloring.services.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringApplication implements CommandLineRunner {
    @Autowired
    MyColor redcolor;

    public static void main(String[] args) {
        SpringApplication.run(ColoringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        redcolor.printColor();

    }
}

