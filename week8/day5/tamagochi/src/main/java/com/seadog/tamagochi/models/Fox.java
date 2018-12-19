package com.seadog.tamagochi.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    String name;
    List<String> tricks;
    Food food;
    Drink drink;


    public Fox() {
    }

    public Fox(String name) {
        this.name = name;

    }

    public String getName() {
        return name;

    }

    public List<String> getTricks() {
        return tricks;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
