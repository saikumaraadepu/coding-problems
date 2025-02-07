import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortArrayOf0s1s2s {

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 1, 2, 0, 1, 2};

        sortArrayOf0s1s2s(arr);
        sortArrayOf0s1s2sDutchFlagAlgorithm(arr);
    }

    public static void sortArrayOf0s1s2s(int[] arr) {

        Map<Integer, Integer> m = new HashMap<>();

        for (int n : arr) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }
        for (int i = 0; i < m.get(0); i++) {
            arr[i] = 0;
        }
        for (int j = m.get(0); j < arr.length - m.get(2); j++) {
            arr[j] = 1;
        }
        for (int k = arr.length - m.get(2); k < arr.length; k++) {
            arr[k] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void sortArrayOf0s1s2sDutchFlagAlgorithm(int[] arr) {

        int n = arr.length;
        int l = 0;
        int m = 0;
        int h = n - 1;
        int t;

        while (m <= h) {

            if (arr[m] == 0) {
                t = arr[m];
                arr[m] = arr[l];
                arr[l] = t;
                l++;
                m++;
            } else if (arr[m] == 2) {
                t = arr[m];
                arr[m] = arr[h];
                arr[h] = t;
                h--;
            } else {
                m++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
