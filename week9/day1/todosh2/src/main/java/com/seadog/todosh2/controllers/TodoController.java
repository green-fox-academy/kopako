package com.seadog.todosh2.controllers;

import com.seadog.todosh2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @RequestMapping(value = {"/", "/list"})
    public String list(Model model) {
        model.addAttribute("list", todoRepository.findAll());
        return "todolist";
    }

}
