package com.seadog.tamagochi.models;

import java.util.List;

public class Fox {
    //name, list of tricks, food and drink
    String name;
    List<String> tricks;
    String food;
    String drink;


    public Fox() {
    }

    public Fox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
