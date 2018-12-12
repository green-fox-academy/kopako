package com.seadog.bankofsimba.controllers;

import com.seadog.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {

    @RequestMapping("/show")
    public String show(Model model){
        model.addAttribute("account", new BankAccount("Simba", 200, "lion"));
        return "index";
    }
}
