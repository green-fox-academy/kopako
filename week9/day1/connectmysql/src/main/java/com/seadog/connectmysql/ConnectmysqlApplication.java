package com.seadog.connectmysql;

import com.seadog.connectmysql.models.Todo;
import com.seadog.connectmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectmysqlApplication implements CommandLineRunner {


    private TodoRepository todoRepository;

    public ConnectmysqlApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectmysqlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Todo i = todoRepository.findByDone(false).stream().findFirst().get();
        i.setDone(true);
    }


}

