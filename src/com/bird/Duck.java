package com.bird;

public class Duck extends Swim {
    Duck(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("FlyDuck");
    }

    @Override
    public void swim() {
        System.out.println("CanSwimDuck");
    }

    @Override
    protected Duck birth(String name) {
        Duck duck = new Duck(name);
        return duck;
    }
}
