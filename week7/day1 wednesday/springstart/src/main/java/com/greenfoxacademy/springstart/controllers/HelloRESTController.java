package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    private static AtomicLong count = new AtomicLong(1);

    @RequestMapping("/greeting")
    public Greatings greeting(@RequestParam String name) {
        return new Greatings(count.getAndIncrement(), "Hello, "+ name+ "!");
    }
}
