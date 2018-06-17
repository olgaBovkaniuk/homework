package com.gmail.olgabovkaniuk.bovkaniuk_8.task1;

public class Triangle implements Figure {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double perimeter() {

        double trianglePerimeter = side1 + side2 + side3;
        return trianglePerimeter;
    }

    public double area() {

        double halfPerimeter = (1/2) * perimeter();
        double triangleArea = Math.sqrt(halfPerimeter*(halfPerimeter-side1)*(halfPerimeter-side2)*(halfPerimeter-side3));

        return triangleArea;
    }
}
