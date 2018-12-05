package com.greenfoxacademy.springstart.controllers;

public class Greatings {
    private long id;
    private String content;

    public Greatings(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
