package com.pluralsight.toolbox;

import com.pluralsight.fruit.*;

import java.util.Random;

public class MeasuringTape {

    // TODO: Implement a Measuring Tape that actually measures distances
    public double getDistance(Tree tree, IFruit fruit) {

        Random random = null;

        try {
            random = new Random();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return random.nextDouble() * fruit.getRollMultiplier();

    }

}
