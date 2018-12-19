package com.seadog.tamagochi.models;

public class Drink {

    private enum drinkType{ SODA, WATER, COFFEE, BEER, PALINKA;}
    private int capacity;

    public Drink() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
