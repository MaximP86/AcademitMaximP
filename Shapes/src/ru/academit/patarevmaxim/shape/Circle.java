package ru.academit.patarevmaxim.shape;

/**
 * Created by 1 on 04.02.2017.
 */
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getWidth() {
        return 2 * radius;
    }

    public double getHeight() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
