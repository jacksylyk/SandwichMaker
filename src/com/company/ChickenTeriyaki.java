package com.company;

public class ChickenTeriyaki extends ToppingDecorator {

    public ChickenTeriyaki(Sandwich newSandwich) {
        super(newSandwich);
        System.out.println("Adding white bread");
        System.out.println("Adding Teryiaki");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chicken Teriyaki";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.50;
    }
}
