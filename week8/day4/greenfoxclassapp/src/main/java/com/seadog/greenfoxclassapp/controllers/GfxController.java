package com.seadog.greenfoxclassapp.controllers;

import com.seadog.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GfxController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String gfx(Model model) {
        model.addAttribute("studentService", studentService);
        return "gfa";
    }

    @GetMapping("/gfa/add")
    public String add(@RequestParam String name) {
        studentService.save(name);
        return "redirect:/";
    }

}
