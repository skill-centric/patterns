package com.skillcentric;

// Class-level Member (Lazy Initialization with double lock Method)
public class SingletonThree {

    private static SingletonThree SINGLE_INSTANCE = null;

    private SingletonThree() {
    }

    public static SingletonThree getInstance() {

        if (SINGLE_INSTANCE == null) {

            synchronized (SingletonThree.class) {

                if (SINGLE_INSTANCE == null) {

                    SINGLE_INSTANCE = new SingletonThree();
                }
            }
        }
        return SINGLE_INSTANCE;
    }
}