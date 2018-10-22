package com.skillcentric;

// By using nested Inner class (Lazy Load method)
public class SingletonFour {

    private SingletonFour() {
    }

    private static class SingletonClassHolder {

        static final SingletonFour SINGLE_INSTANCE = new SingletonFour();
    }

    public static SingletonFour getInstance() {

        return SingletonClassHolder.SINGLE_INSTANCE;
    }
}