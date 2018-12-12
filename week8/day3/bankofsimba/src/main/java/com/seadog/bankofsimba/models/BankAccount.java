package com.seadog.bankofsimba.models;

public class BankAccount {
    private String name;
    private int balance;
    private String animalType;

    public BankAccount(String name, int balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }
}
