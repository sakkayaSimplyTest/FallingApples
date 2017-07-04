package com.pluralsight.fruit;

public class Banana implements IFruit{

    @Override
    public String getName() {
        return "Banana";
    }

    @Override
    public int getRollMultiplier() {
        return 10;
    }
}
