package com.seadog.restapi.models;

public class Until {
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Until() {
    }

    public Until(int result) {
        this.result = result;
    }



    public static int factorial(int until){
        if (until == 0)
            return 1;
        else
            return(until * factorial(until-1));
    }

    public static int sum(int until) {
        int sum =0;
        for (int i = 0; i <= until; i++) {
            sum +=i;
        }
        return sum;
    }
}
