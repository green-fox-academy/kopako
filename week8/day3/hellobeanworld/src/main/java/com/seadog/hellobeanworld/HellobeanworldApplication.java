package com.seadog.hellobeanworld;

import com.seadog.hellobeanworld.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HellobeanworldApplication.class, args);
    }
        @Autowired
        Printer printer;

    @Override
    public void run(String... args) throws Exception {

        printer.log("hello");
    }
}

