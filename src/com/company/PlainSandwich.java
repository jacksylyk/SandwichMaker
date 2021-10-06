package com.company;

public class PlainSandwich implements Sandwich {

    @Override
    public String getDescription() {
        return "white bread";
    }

    @Override
    public double getCost() {
        return 2.00;
    }
}
