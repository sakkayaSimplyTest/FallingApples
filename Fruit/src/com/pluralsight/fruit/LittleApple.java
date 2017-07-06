package com.pluralsight.fruit;

/**
 * Created by David Starr.
 */
public class LittleApple implements ITastyFruit {

    private final Apple apple = new Apple();

    public int getDiameter(){ return 3; }

    public String getName() {
        return apple.getName();
    }

    public int getRollMultiplier() {
        return apple.getRollMultiplier();
    }
}