package com.pluralsight.fruit;

/**
 * Created by dxstarr on 7/3/17.
 */
public class Orange implements IFruit {

    @Override
    public String getName() {
        return "Orange";
    }

    @Override
    public int getRollMultiplier() {
        return 100;
    }
}
