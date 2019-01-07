package com.seadog.restapi.models;

public class Doubling {
    private int received;
    private int result;


    public Doubling() {
    }

    public void setReceived(int received) {
        this.received = received;
        this.result = received * 2;
    }

    public int getReceived() {
        return received;
    }

    public int getResult() {
        return result;
    }
}
