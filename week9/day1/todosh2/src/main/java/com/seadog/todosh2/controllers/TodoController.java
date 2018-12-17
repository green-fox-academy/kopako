package com.seadog.todosh2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    @RequestMapping(value = { "/", "/list" })
    @ResponseBody()
    public String list() {

        return "This is my first Todo";
    }

}
