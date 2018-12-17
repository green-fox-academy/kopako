package com.seadog.connectmysql.controllers;

import com.seadog.connectmysql.models.Todo;
import com.seadog.connectmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @RequestMapping(value = {"/", "/list"})
    public String list(Model model, @RequestParam(required = false) Boolean isActive) {
        if (isActive != null) {
            model.addAttribute("todos", (List<Todo>) todoRepository.findByDone(!isActive) );
            return "todolist";
        } else {
            model.addAttribute("todos", (List<Todo>) todoRepository.findAll());
        }
        return "todolist";
    }

}
