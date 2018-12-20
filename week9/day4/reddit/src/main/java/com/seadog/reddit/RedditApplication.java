package com.seadog.reddit;

import com.seadog.reddit.models.Post;
import com.seadog.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication {

    @Autowired
    PostService service;

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }

}

