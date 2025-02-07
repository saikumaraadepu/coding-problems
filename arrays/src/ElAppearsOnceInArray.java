import java.util.HashMap;
import java.util.Map;

public class ElAppearsOnceInArray {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        System.out.println(findElAppearsOnceInArray(arr));
    }

    public static int findElAppearsOnceInArray(int[] arr) {

        Map<Integer, Integer> m = new HashMap<>();

        for (int n : arr) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }

        int sol = 0;

        for (Map.Entry<Integer, Integer> e: m.entrySet()) {
            if (e.getValue() == 1) {
                sol = e.getKey();
            }
        }
        return sol;
    }
}