package com.seadog.bankofsimba.models;

public class BankAccount {
    private String name;
    private int balance;
    private String animalType;
    private boolean king;
    private boolean good;

    public BankAccount() {
    }

    public BankAccount(String name, int balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king=false;
        this.good=false;
    }

    public BankAccount(String name, int balance, String animalType, boolean king, boolean goodOrBad) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
        this.good = goodOrBad;
    }

    public void raise(){
        if (this.king) {
            this.balance += 100;
        } else {
            this.balance += 10;
        }
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

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setKing(boolean king) {
        this.king = king;
    }

    public void setGood(boolean good) {
        this.good = good;
    }
}
