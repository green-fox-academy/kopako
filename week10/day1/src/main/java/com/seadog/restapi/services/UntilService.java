package com.seadog.restapi.services;

public class UntilService {

    public static Integer until(String action, Integer number) {
        if (number == null) {
            throw new UnsupportedOperationException("Please provide a number!");
        }

        if (action.toLowerCase().equals("sum")) {
            return sum(number);
        } else if (action.toLowerCase().equals("factor")) {
            return factorial(number);
        }
        return null;
    }

    public static int factorial(int until) {
        if (until == 0)
            return 1;
        else
            return (until * factorial(until - 1));
    }

    public static int sum(int until) {
        int sum = 0;
        for (int i = 0; i <= until; i++) {
            sum += i;
        }
        return sum;
    }
}
