package com.pluralsight.fruit;

public class Banana implements ILongFruit {

    private static final String NAME = "Banana";
    private static final int ROLL_MULTIPLIER = 0;

    @Override
    public int getLengthInInches() { return 10; }

    public String getName() {

        return NAME;
    }

    public int getRollMultiplier() {

        return ROLL_MULTIPLIER;
    }
}
