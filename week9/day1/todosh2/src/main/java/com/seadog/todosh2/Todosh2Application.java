package com.seadog.todosh2;

import com.seadog.todosh2.models.Todo;
import com.seadog.todosh2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todosh2Application implements CommandLineRunner {

    @Autowired
    TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(Todosh2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 5; i++) {
            todoRepository.save(new Todo("Title #" + i));
        }
    }
}

