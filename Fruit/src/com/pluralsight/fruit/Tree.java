package com.pluralsight.fruit;

import java.util.ArrayList;

public class Tree {

    private final ArrayList<ITastyFruit> fruitOnTree;

    public Tree(ArrayList<ITastyFruit> fruitOnTree) {

        this.fruitOnTree = fruitOnTree;

    }

    public ITastyFruit dropFruit() {

        ITastyFruit fruit = fruitOnTree.get(0);
        fruitOnTree.remove(0);

        return fruit;
    }

    public int getFruitOnTree() {
        return fruitOnTree.size();
    }

}
