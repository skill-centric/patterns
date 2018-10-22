package com.skillcentric;

// Class-level Member (Eager Initialization Method)
public class SingletonOne {

    private static final SingletonOne SINGLE_INSTANCE = new SingletonOne();

    private SingletonOne() {
    }

    public static SingletonOne getInstance() {

        return SINGLE_INSTANCE;
    }
}
