package com.bird;

public class Geese extends Swim {
    Geese(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("CanSwimGeese");
    }

    @Override
    protected Geese birth(String name) {
        Geese geese = new Geese(name);
        return geese;
    }
}
