package ru.academit.patarevmaxim.range;

/**
 * Created by 1 on 22.01.2017.
 */
public class Range {
    private double from;
    private double to;

    public Range(double from, double to) { // конструктор
        this.from = from;
        this.to = to;
    }

    public double length() { // метод без аргументов
        return to - from; // исходя из предположения, что to > from всегда, либо тогда использовать Math.abs()
    }

    public boolean isInside(double x) {
        return (x >= from && x <= to);
    }

    public static void main(String[] args) {
        Range myFirstRange = new Range(-3.0, 9.2);
        System.out.println(myFirstRange.length());

        System.out.println(myFirstRange.isInside(6.5));
        System.out.println(myFirstRange.isInside(-7.3));
    }
}

