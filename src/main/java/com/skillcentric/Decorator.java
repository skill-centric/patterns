package com.skillcentric;

public abstract class Decorator implements Shape {

    protected Shape decoratedShape;

    public Decorator(Shape decoratedShape) {
        super();
        this.decoratedShape = decoratedShape;
    }
}