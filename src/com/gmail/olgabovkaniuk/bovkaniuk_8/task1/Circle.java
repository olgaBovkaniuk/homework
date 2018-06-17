package com.gmail.olgabovkaniuk.bovkaniuk_8.task1;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double perimeter() {
        double circlePerimeter = 2*Math.PI*radius;
        return circlePerimeter;
    }

    public double area() {
        double circleArea = Math.PI*radius*radius;
        return circleArea;
    }
}
