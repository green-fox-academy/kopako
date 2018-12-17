package com.seadog.todosh2.models;

import javax.persistence.*;

@Entity
public class Todo {
    @Id
    private long id;
    private String title;
    private boolean urgent;
    private boolean done;
}