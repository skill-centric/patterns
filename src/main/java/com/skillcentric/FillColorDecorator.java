package com.skillcentric;

public class FillColorDecorator extends Decorator {

    protected Color color;

    public FillColorDecorator(Color color, Shape decoratedShape) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Fill Color: " + color);
    }
}