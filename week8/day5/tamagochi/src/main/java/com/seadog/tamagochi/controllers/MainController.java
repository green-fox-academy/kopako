package com.seadog.tamagochi.controllers;

import com.seadog.tamagochi.models.Fox;
import com.seadog.tamagochi.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    FoxService foxService;

    public MainController() {
    }

    @GetMapping("/")
    public String index(@RequestParam(value = "name", required = false) String name, Model model) {
        if (name == null || !foxService.nameExist(name)) return "redirect:/login";
        model.addAttribute("fox", foxService.getFoxByName(name));
        return "index";
    }

    @GetMapping("/login")
    public String login(@ModelAttribute("fox") Fox fox, Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("name") String name, Model model) {
        if (name != null) {
            foxService.addIfValid(new Fox(name));
            model.addAttribute(foxService.getFoxByName(name));
            return "redirect:/?name=" + name;
        } else return "redirect:/login";
    }
}
