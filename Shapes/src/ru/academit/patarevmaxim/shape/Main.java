package ru.academit.patarevmaxim.shape;


/**
 * Created by 1 on 28.01.2017.
 */
public class Main {

    public static double getMaxArea(double firstArea, double secondArea, double thirdArea, double fourthArea) {
        return Math.max(firstArea, Math.max(secondArea, Math.max(thirdArea, fourthArea)));
    }

    public static void main(String[] args) {
        Shape firstShape = new Square(5.5);
        Shape secondShape = new Triangle(5.5, 0.1, 6.4, 2.48, 8.8, 41.01);
        Shape thirdShape = new Rectangle(8.7, 20.4);
        Shape fourthShape = new Circle(6.1);

        System.out.println(firstShape.getArea());
        System.out.println(firstShape.getHeight());
        System.out.println(firstShape.getWidth());
        System.out.println(firstShape.getPerimeter());

        System.out.println(secondShape.getArea());
        System.out.println(secondShape.getHeight());
        System.out.println(secondShape.getWidth());
        System.out.println(secondShape.getPerimeter());

        System.out.println(thirdShape.getArea());
        System.out.println(thirdShape.getHeight());
        System.out.println(thirdShape.getWidth());
        System.out.println(thirdShape.getPerimeter());

        System.out.println(fourthShape.getArea());
        System.out.println(fourthShape.getHeight());
        System.out.println(fourthShape.getWidth());
        System.out.println(fourthShape.getPerimeter());

        System.out.println("Максимальная площадь: " + getMaxArea(firstShape.getArea(), secondShape.getArea(), thirdShape.getArea(), fourthShape.getArea()));
    }
}
