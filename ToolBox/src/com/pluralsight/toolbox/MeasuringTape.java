package com.pluralsight.toolbox;

import com.pluralsight.fruit.ITastyFruit;
import com.pluralsight.fruit.Tree;

import java.util.Random;

public class MeasuringTape {

    private MeasuringTape() {
    }

    public static MeasuringTape createMeasuringTape() {
        return new MeasuringTape();
    }

    // TODO: Implement a Measuring Tape that actually measures distances
    public double getDistance(ITastyFruit aFruit, Tree tree) {

        Random random = new Random();

        return random.nextDouble() * aFruit.getRollMultiplier();

    }
}
