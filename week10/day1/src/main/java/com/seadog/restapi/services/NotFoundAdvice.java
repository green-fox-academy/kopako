package com.seadog.restapi.services;

import com.seadog.restapi.models.RestError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class NotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    RestError notFoundHandler(MissingServletRequestParameterException ex) {
        String parameterName = ex.getParameterName();
        String article = getArticle(ex.getParameterName());
        if(parameterName.equals("until")) return new RestError("Please provide a number!");
        return new RestError("Please provide " + article + " " + parameterName + "!");
    }

    private String getArticle(String testString) {
        String article = "a";
        String vowels = "aeiou";

        if (vowels.indexOf(Character.toLowerCase(testString.charAt(0))) != -1) {
            article = "an";
        }
        return article;
    }
}