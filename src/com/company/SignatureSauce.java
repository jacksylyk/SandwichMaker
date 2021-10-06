package com.company;

public class SignatureSauce extends ToppingDecorator{
    public SignatureSauce(Sandwich newSandwich) {
        super(newSandwich);
        System.out.println("Adding signature sauce");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Signature sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + .50;
    }
}
