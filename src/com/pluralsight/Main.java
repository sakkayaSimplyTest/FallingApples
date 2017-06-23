package com.pluralsight;

import com.pluralsight.fruit.*;
import com.pluralsight.toolbox.MeasuringTape;

class Main {

    public static void main(String[] args) {

        MeasuringTape measuringTape = new MeasuringTape();

        Tree tree = new Tree(10);

        System.out.println("STARTING FRUIT ON TREE: " + tree.getApplesOnTree());

        DropAllTheFruit(measuringTape, tree);

        System.out.println("ENDING FRUIT ON TREE: " + tree.getApplesOnTree());

    }

    private static void DropAllTheFruit(MeasuringTape measuringTape, Tree tree) {

        int startingApplesOnTree = tree.getApplesOnTree();

        for (int i = 1; i <= startingApplesOnTree; i++) {

            Apple apple = tree.dropApple();

            double distanceFromTree = measuringTape.getDistance(tree, apple);

            System.out.println("Apple " + (i) + ": " + (int) distanceFromTree + " feet");
        }
    }
}

