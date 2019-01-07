package com.seadog.restapi.models;

public class ReceivingArray {
    private String what;
    private int[] numbers;

    public ReceivingArray() {
    }

    public ReceivingArray(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

}
