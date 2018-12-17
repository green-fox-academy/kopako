package com.seadog.connectmysql.controllers;

import com.seadog.connectmysql.models.Todo;
import com.seadog.connectmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @RequestMapping(value = {"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos",(List<Todo>) todoRepository.findAll());
        return "todolist";
    }

}
