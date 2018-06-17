package com.gmail.olgabovkaniuk.bovkaniuk_8.task1;

public class Rectangle implements Figure {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double perimeter() {
        double rectanglePerimeter = 2*(side1 + side2);
        return rectanglePerimeter;
    }

    public double area() {
        double rectangleArea = side1*side2;
        return rectangleArea;
    }
}
