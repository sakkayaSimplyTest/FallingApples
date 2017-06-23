package com.pluralsight.fruit;

public class Tree {

    private int applesOnTree;

    public Tree() {
        this(5);
    }

    public Tree(int applesOnTree) {

        this.applesOnTree = applesOnTree;
    }

    public Apple dropApple() {

        applesOnTree = applesOnTree - 1;

        return new Apple();
    }

    public int getApplesOnTree() {
        return applesOnTree;
    }
}
