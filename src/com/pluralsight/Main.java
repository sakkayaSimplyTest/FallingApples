package com.pluralsight;

import com.pluralsight.fruit.*;
import com.pluralsight.toolbox.MeasuringTape;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        ArrayList<IFruit> fruit = getFruit();

        Tree tree = new Tree(fruit);

        System.out.println("STARTING FRUIT ON TREE: " + tree.getFruitOnTree());

        DropAllTheFruit(tree);

        System.out.println("ENDING FRUIT ON TREE: " + tree.getFruitOnTree());

    }

    private static ArrayList<IFruit> getFruit() {
        ArrayList<IFruit> fruit = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            fruit.add(new Apple());
        }
        return fruit;
    }

    private static void DropAllTheFruit(Tree tree) {

        MeasuringTape measuringTape = new MeasuringTape();

        int startingApplesOnTree = tree.getFruitOnTree();

        for (int i = 1; i <= startingApplesOnTree; i++) {

            IFruit fruit = tree.dropFruit();

            double distanceFromTree = measuringTape.getDistance(tree, fruit);

            System.out.println(fruit.getName() + " " + (i) + ": " + (int) distanceFromTree + " feet");
        }
    }
}

