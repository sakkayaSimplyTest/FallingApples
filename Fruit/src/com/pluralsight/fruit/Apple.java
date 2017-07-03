package com.pluralsight.fruit;


public class Apple implements IFruit {

    private static final String NAME = "Apple";
    private static final int ROLL_MULTIPLIER = 10;


    @Override
    public String getName() {
        System.out.println("NAME: " + NAME);
        return NAME;
    }

    @Override
    public int getRollMultiplier() {
        System.out.println("ROLL_MULTIPLIER: " + ROLL_MULTIPLIER);
        return ROLL_MULTIPLIER;
    }
}

