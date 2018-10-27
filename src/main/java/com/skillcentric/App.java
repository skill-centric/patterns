package com.skillcentric;

public class App {

    public static void main(String[] args) {

        Shape triangle = new FillColorDecorator(Color.RED,
                new LineStyleDecorator(LineStyle.DASH,
                        new LineThicknessDecorator(2.0d, new Triangle())));
        triangle.draw();
    }
}