import java.util.*;

public class TopKMostFrequentElements {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;

        System.out.println(Arrays.toString(topKElements(arr, k)));

    }

    public static int[] topKElements(int[] arr, int k) {

        Map<Integer, Integer> m = new HashMap<>();

        //Counting frequency of elements
        for (int n : arr) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        //Inserting k number of entry sets to heap
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            q.offer(e);
            if (q.size() > k) {
                q.poll();
            }
        }

        //Creating a res array of size k
        int[] res = new int[k];

        //Adding heap's entry set's keys to the res array
        for (int i = 0; i < res.length; i++) {
            res[i] = Objects.requireNonNull(q.poll()).getKey();
        }

        //Reversing res array
        int l = 0;
        int r = res.length - 1;
        while (l < r) {
            int t = res[l];
            res[l] = res[r];
            res[r] = t;
            l++;
            r--;
        }

        return res;
    }
}
