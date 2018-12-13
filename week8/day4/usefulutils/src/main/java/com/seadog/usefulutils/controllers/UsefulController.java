package com.seadog.usefulutils.controllers;

import com.seadog.usefulutils.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulController {

    @Autowired
    UtilityService utilityService;

    @GetMapping("/useful")
    public String useful() {
        return null;
    }

    @GetMapping("/useful/colorful")
    public String colorful(Model model) {
        model.addAttribute("color", utilityService);
        return "colorful";
    }

    @GetMapping("/useful/email")
    public String email(@RequestParam(required = false) String email, Model model) {
        model.addAttribute(
                "validEmail",
                utilityService.validateEmail(email)
        );
        model.addAttribute("email", email);
        return "email";
    }

    @GetMapping("/useful/caesar")
    public String caesar(Model model, @RequestParam String text, @RequestParam int number) {
        model.addAttribute("text", utilityService.caesar(text, number));
        return "caesar";
    }
}
