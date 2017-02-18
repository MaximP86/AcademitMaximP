
/**
 * Created by 1 on 18.02.2017.
 */
public class InsertionSort {
    private int[] a;

    public InsertionSort(int[] a) {
        this.a = a;
    }

    public int[] doSort(int[] a) {

        for (int i = 1; i < a.length; ++i) {
            int currentElement = a[i]; // текущий элемент, начиная с a[0] = 8
            int j; // индекс элемента, предшествующий индексу i
            for (j = i - 1; j >= 0 && a[j] > currentElement; --j) { // идем справа налево по отсортированной части массива
                a[j + 1] = a[j]; // вставляем элемент в нужное место на каждой итерации внутреннего цикла
            }
            a[j + 1] = currentElement; // сдвиг элементов на 1 вправо по массиву
        }

     return a;
    }
}
