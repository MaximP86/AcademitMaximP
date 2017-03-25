package ru.academit.patarevmaxim.list;

/**
 * Created by 1 on 12.03.2017.
 */
public class ListItem {
    private int data;
    private ListItem next;

    public ListItem(int data) {
        this.data = data;
    }

    public ListItem(int data, ListItem next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public ListItem getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }
}

