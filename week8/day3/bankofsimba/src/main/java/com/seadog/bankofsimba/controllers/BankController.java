package com.seadog.bankofsimba.controllers;

import com.seadog.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {

    @RequestMapping("/show")
    public String show(Model model){
        model.addAttribute("account", new BankAccount("Simba", 2000, "lion"));
        return "index";
    }

    @RequestMapping("/HTMLception")
    public String htmlCeption(Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "HTMLception";
    }
}
