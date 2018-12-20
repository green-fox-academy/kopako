package com.seadog.reddit.controllers;

import com.seadog.reddit.models.Post;
import com.seadog.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    PostService postService;

    @GetMapping("/all")
    public String index(Model model) {
        model.addAttribute("posts", postService.findAll());
        return "index";
    }

    @GetMapping("/")
    public String indexTop10(Model model) {
        model.addAttribute("posts", postService.findTop10ByOrderByRatingDesc());
        return "index";
    }

    @GetMapping("/submit")
    public String submitByIdForm(Model model) {
        model.addAttribute("post", new Post());
        return "submit";
    }

    @PostMapping("/submit")
    public String createSubmit(@ModelAttribute Post post) {
        postService.save(post);
        return "redirect:/all";
    }

    @GetMapping("/{id}/like")
    public String likeById(@PathVariable Long id) {
        postService.like(id);
        return "redirect:/all";
    }

    @GetMapping("/{id}/dislike")
    public String dislikeById(@PathVariable Long id) {
        postService.dislike(id);
        return "redirect:/all";
    }
}
