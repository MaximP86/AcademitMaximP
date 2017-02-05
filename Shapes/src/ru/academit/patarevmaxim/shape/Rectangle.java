package ru.academit.patarevmaxim.shape;

/**
 * Created by 1 on 04.02.2017.
 */
public class Rectangle implements Shape {
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getArea() {
        return length * height;
    }

    public double getWidth() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getPerimeter() {
        return (length + height) * 2;
    }
}
