package com.seadog.bankofsimba.controllers;

import com.seadog.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {

    @RequestMapping("/show")
    public String show(Model model){
        model.addAttribute("account", new BankAccount("Simba", 2000, "lion", true,true));
        return "index";
    }

    @RequestMapping("/HTMLception")
    public String htmlCeption(Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "HTMLception";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<BankAccount> list = new ArrayList<>();
        list.add(new BankAccount("Pumba", 5, "warthog", false,true));
        list.add(new BankAccount("Timon", 2, "meerkat", false,true));
        list.add(new BankAccount("Mufasa", 9999999, "lion", true,true));
        list.add(new BankAccount("Scar", 666, "lion", false,false));
        list.add(new BankAccount("Azizi", 0, "hyenas", false, false));
        model.addAttribute("list", list);
        return "list";
    }
}
