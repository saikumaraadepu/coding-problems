import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 4, 3, 4, 2, 5, 6, 7, 4, 9, 11};

        removeDuplicateElements(arr);
    }

    public static void removeDuplicateElements(int[] arr) {

        Set<Integer> s = new HashSet<>();

        for (int n : arr) {
            s.add(n);
        }
        System.out.println(s);
    }
}
