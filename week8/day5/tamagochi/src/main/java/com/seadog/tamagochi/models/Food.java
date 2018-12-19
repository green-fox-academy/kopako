package com.seadog.tamagochi.models;

public class Food {
    private FoodType foodType;
    private int capacity;

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Food() {
    }
}
