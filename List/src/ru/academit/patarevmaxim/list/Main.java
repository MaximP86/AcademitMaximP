package ru.academit.patarevmaxim.list;

/**
 * Created by 1 on 12.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        List s = new List();
        s.addToBeginning(17);
        s.addToBeginning(15);
        s.addToBeginning(12);
        s.addToBeginning(9);
        s.addToBeginning(7);
        s.addToBeginning(5);
        s.addToBeginning(4);
        s.addToBeginning(2);
        s.print();

        System.out.printf("%nРазмер списка: %d%n", s.getListSize());

        s.deleteFirstItem();
        s.print();

        s.deleteItemOfData(12);
        s.print();


    }
}
