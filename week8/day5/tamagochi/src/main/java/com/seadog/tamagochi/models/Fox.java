package com.seadog.tamagochi.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    String name;
    List<String> tricks;
    String food;
    String drink;


    public Fox() {
    }

    public Fox(String name) {
        this.name = name;

        this.food = "Food";
        this.drink = "Sor";
        this.tricks = new ArrayList<>();
        tricks.add("sleep");
        tricks.add("backflip");
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

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setName(String name) {
        this.name = name;
    }
}
