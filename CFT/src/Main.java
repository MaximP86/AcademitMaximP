import java.util.Arrays;

/**
 * Created by 1 on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {5, 6, 3, 8, 4, 9, 2, 10, 1, 7};
        InsertionSort firstInsertionSort = new InsertionSort(a);
        System.out.println(Arrays.toString(a.doSort()));
    }
}
