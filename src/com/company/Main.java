package com.company;

public class Main {

    public static void main(String[] args) {
	    Sandwich basicSandwich = new SignatureSauce(new ChickenTeriyaki(new PlainSandwich()));

        System.out.println("Ingredients: " + basicSandwich.getDescription());

        System.out.println("Price: " + basicSandwich.getCost());

    }
}
