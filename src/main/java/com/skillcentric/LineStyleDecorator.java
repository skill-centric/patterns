package com.skillcentric;

public class LineStyleDecorator extends Decorator {

    protected LineStyle style;

    public LineStyleDecorator(LineStyle style, Shape decoratedShape) {
        super(decoratedShape);
        this.style = style;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Line Style: " + style);
    }
}