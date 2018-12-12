package com.seadog.bankofsimba.models;

public class BankAccount {
    private String name;
    private int balance;
    private String animalType;
    private boolean king;
    private boolean good;

    public BankAccount() {
    }

    public BankAccount(String name, int balance, String animalType, boolean king, boolean goodOrBad) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
        this.good = goodOrBad;
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

    public boolean isKing() {
        return king;
    }

    public boolean isGood() {
        return good;
    }
}
