package com.seadog.restapi.models;

public class UntilInput {
    private int until;

    public UntilInput(int until) {
        this.until = until;
    }

    public UntilInput() {
    }

    public int getUntil() {
        return until;
    }

    public void setUntil(int until) {
        this.until = until;
    }
}
