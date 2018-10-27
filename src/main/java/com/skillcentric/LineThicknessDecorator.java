package com.skillcentric;

public class LineThicknessDecorator extends Decorator {

    protected double thickness;

    public LineThicknessDecorator(double thickness, Shape decoratedShape) {
        super(decoratedShape);
        this.thickness = thickness;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Line thickness: " + thickness);
    }
}