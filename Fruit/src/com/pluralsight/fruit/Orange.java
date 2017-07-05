package com.pluralsight.fruit;

public class Orange implements IFruit {


    private int foo = 0;

    private int bar = 0;

    public int getFoo() {
        return foo;
    }

    public void setFoo(int foo) {
        this.foo = foo;
    }

    public int getBar() {
        return bar;
    }

    public void setBar(int bar) {
        this.bar = bar;
    }

    @Override
    public String getName() {
        return "Orange";
    }

    @Override
    public int getRollMultiplier() {
        return 100;
    }
}
