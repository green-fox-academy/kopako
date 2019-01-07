package com.seadog.restapi.models;

public class ResultArray {
    private int[] result;

    public ResultArray() {
    }

    public ResultArray(int[] result) {
        this.result = result;
    }

    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }
}
