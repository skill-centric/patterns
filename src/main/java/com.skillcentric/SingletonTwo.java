package com.skillcentric;

// Class-level Member (Lazy Initialization Method)
public class SingletonTwo {

    private static SingletonTwo SINGLE_INSTANCE = null;

    private SingletonTwo() {
    }

    public static SingletonTwo getInstance() {

        if (SINGLE_INSTANCE == null) {

            synchronized (SingletonTwo.class) {

                SINGLE_INSTANCE = new SingletonTwo();
            }
        }
        return SINGLE_INSTANCE;
    }
}