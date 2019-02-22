package com.bird;

public abstract class  Birds<T> {
    private final String name;

    Birds(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fly(){
        System.out.println("Fly");
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     *
     * @return new bird of type T
     */
    abstract protected  T birth(String name);

}
