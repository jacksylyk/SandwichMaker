package com.company;

abstract class ToppingDecorator implements Sandwich {
    protected Sandwich tempSandwich;

    public ToppingDecorator(Sandwich newSandwich){
        tempSandwich = newSandwich;
    }

    public String getDescription(){
        return tempSandwich.getDescription();
    }

    @Override
    public double getCost() {
        return tempSandwich.getCost();
    }
}
