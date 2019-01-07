package com.seadog.restapi.models;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class RestError {


    private String error;

    public RestError() {
    }

    public RestError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
