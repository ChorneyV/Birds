package com.bird;

public class Sparrow  extends Birds{
    Sparrow(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("FlySparrow");
    }

    @Override
    protected Sparrow birth(String name) {
        Sparrow sparrow = new Sparrow(name);
        return sparrow;
    }
}
