import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 1 on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\1\\IdeaProjects\\AcademitMaximP\\CFT\\src\\input.txt"))) {
            int count = scanner.nextInt();
            int[] a = new int[count];
            for (int i = 0; i < count; ++i) {
                a[i] = scanner.nextInt();
            }

            for (int i = 1; i < a.length; ++i) {
                int currentElement = a[i];
                int j;
                for (j = i - 1; j >= 0 && a[j] > currentElement; --j) {
                    a[j + 1] = a[j];
                }
                a[j + 1] = currentElement;
            }

            try (PrintWriter writer = new PrintWriter("output.txt")) {
                writer.println(Arrays.toString(a));
                writer.close();
            }
        }
    }
}