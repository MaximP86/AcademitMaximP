package ru.academit.patarevmaxim.shape;

/**
 * Created by 1 on 04.02.2017.
 */
public class Triangle implements Shape {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public static double getLength(double firstX, double firstY, double secondX, double secondY) {
        return Math.sqrt(Math.pow((firstX - secondX), 2) + Math.pow((firstY - secondY), 2));
    }

    public double getArea() {
        double firstSide = getLength(x1, y1, x2, y2);
        double secondSide = getLength(x2, y2, x3, y3);
        double thirdSide = getLength(x3, y3, x1, y1);
        double halfOfPerimeter = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - firstSide) * (halfOfPerimeter - secondSide) * (halfOfPerimeter - thirdSide));
    }

    public double getWidth() {
        return Math.max(x1, Math.max(x2, x3)) - Math.min(x1, Math.min(x2, x3));
    }

    public double getHeight() {
        return Math.max(y1, Math.max(y2, y3)) - Math.min(y1, Math.min(y2, y3));
    }

    public double getPerimeter() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)) + Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2)) + Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
    }
}

