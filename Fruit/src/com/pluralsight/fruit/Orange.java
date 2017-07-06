package com.pluralsight.fruit;

public class Orange implements ITastyFruit {

    @Override
    public String getName() {
        return "Orange";
    }

    @Override
    public int getRollMultiplier() {
        return 100;
    }
}
