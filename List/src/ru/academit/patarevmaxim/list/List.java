package ru.academit.patarevmaxim.list;

/**
 * Created by 1 on 12.03.2017.
 */
public class List {
    private ListItem head;

    public List() {
    }

    public int getListSize() { // получение размера списка
        int size = 0;
        for (ListItem p = head; p != null; p = p.getNext()) {
            size++;
        }
        return size;
    }

    public ListItem getFirstItem() { // получение первого узла
        return head; }

    public ListItem getData(ListItem next) { // получение значения по указанному индексу
        return ListItem ();
    }

    public void add(int data){ // вставка элемента в начало
        ListItem newItem = new ListItem(data, head);
        head = newItem;
    }
}
