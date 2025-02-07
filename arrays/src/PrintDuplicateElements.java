import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateElements {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 4, 3, 4, 2, 5, 6, 7, 4, 9, 11};

        printDuplicateElements(arr);

    }

    public static void printDuplicateElements(int[] arr) {

        Set<Integer> s = new HashSet<>();
        Set<Integer> d = new HashSet<>();
        for (int n : arr) {
            if (!s.add(n)) {
                d.add(n);
            }
        }
        System.out.println(d);
    }
}
