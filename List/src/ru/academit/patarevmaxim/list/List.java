package ru.academit.patarevmaxim.list;

/**
 * Created by 1 on 12.03.2017.
 */
public class List {
    private ListItem head;

    public List() {
    }

    public void print() { // печать списка
        for (ListItem p = head; p != null; p = p.getNext()) {
            System.out.printf("%d ", p.getData());
        }
    }

    public int getListSize() { // получение размера списка
        int size = 0;
        for (ListItem p = head; p != null; p = p.getNext()) {
            size++;
        }
        return size;
    }

    public ListItem getFirstItem() { // получение первого узла
        return head;
    }

    public void addToBeginning(int data) { // вставка элемента в начало
        ListItem newItem = new ListItem(data, head);
        head = newItem;
    }

    public void deleteFirstItem() { // удаление первого элемента
        System.out.printf("Удален элемент %d%n", head.getData());
        head = head.getNext();

    }

    public void deleteItemOfData(int data) { // удаление узла по значению
        if (head.getData() == data) {
            System.out.printf("Удален элемент %d%n", data);
            head = head.getNext();
        } else {
            for (ListItem p = head; p.getNext() != null; p = p.getNext()) {

                if (p.getData() == data) {
                    p = p.getNext().getNext();
                }
            }
        }
    }

    public int getDataOfIndex (int index) {
        int i = 0;

        for (ListItem p = head; p.getNext() != null; p = p.getNext()) {
            if ()
        }
    }
}
