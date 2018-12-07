package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.pojo.ItemsSingleton;
import com.greenfoxacademy.webshop.pojo.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    List<ShopItem> items = ItemsSingleton.getInstance();

    {
        items.add(new ShopItem("Running shoes","Nike running shoesfor every day sport", (long) 25, 5));
        items.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", (long) 119, 100));
        items.add(new ShopItem("T-shirt","Blue, with a corgi on a bike",(long)300,1));
        items.add(new ShopItem("Coca Cola", "0.5l standard coke", (long) 15,0));
        items.add(new ShopItem("Printer", "Some HP printer that will print pages",(long)3000,2));
    }

    @RequestMapping("/webshop")
    public String webshop(Model model) {
        model.addAttribute("items", items);
        return "webshop";
    }
}
