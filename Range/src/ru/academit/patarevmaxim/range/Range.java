package ru.academit.patarevmaxim.range;

/**
 * Created by 1 on 22.01.2017.
 */
public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {

        if (to < from) {
            throw new WrongValuesOfArgumentsException("Значение конца диапазона должно быть больше начала");
        } else {
            this.from = from;
            this.to = to;
        }
    }

    public void setFrom(double from) {
        if (to < from) {
            throw new IllegalArgumentException("Значение конца диапазона должно быть больше начала");
        }
        this.from = from;
    }

    public void setTo(double to) {
        if (to < from) {
            throw new IllegalArgumentException("Значение конца диапазона должно быть больше начала");
        }
        this.to = to;
    }

    public double length() { // метод без аргументов
        return to - from; // исходя из предположения, что to > from всегда, либо тогда использовать Math.abs()
    }

    public boolean isInside(double x) { // принадлежит ли число диапазону
        return (x >= from && x <= to);
    }

    public Range intersection(Range range) { // пересечение диапазонов
        if (range.from > this.to || this.from > range.to) {
            return null;
        } else {
            return new Range(Math.max(this.from, range.from), Math.min(this.to, range.to));
        }
    }

    public Range[] association(Range range) { // объединение диапазонов
        if (range.from < this.to || this.from < range.to) {
            Range[] r = {new Range(Math.max(this.from, range.from), Math.min(this.to, range.to))};
            return r;
        }
        Range[] r = {new Range(this.from, this.to), new Range(range.from, range.to)};
        return r;
    }

    public Range[] difference(Range range) { // вычитание диапазонов
        if (range.from < this.to || this.from < range.to) {
            Range[] r = {new Range(this.from, range.from), new Range(this.to, range.to)};
            return r;
        }
        return null;
    }

    public static void main(String[] args) {
        Range myFirstRange = new Range(3.0, 9.2);
        System.out.println(myFirstRange.length());

        System.out.println(myFirstRange.isInside(6.5));
        System.out.println(myFirstRange.isInside(-7.3));

        Range mySecondRange = new Range(2, 7);
        Range myThirdRange = new Range(5, 9);
        System.out.println(mySecondRange.intersection(myThirdRange));

        System.out.println(mySecondRange.association(myThirdRange));
        System.out.println(mySecondRange.difference(myThirdRange));
    }
}

