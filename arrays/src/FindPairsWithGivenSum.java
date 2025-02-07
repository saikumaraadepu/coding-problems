import java.util.*;

public class FindPairsWithGivenSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 5, 6, 8};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 8;

        findPairsWithGivenSum(arr, sum);
        findPairsWithGivenSumSortedArray(arr1, sum);

    }

    public static void findPairsWithGivenSum(int[] arr, int sum) {

        Set<ArrayList<Integer>> s = new HashSet<>();

        for (int k : arr) {

            for (int i : arr) {

                if ((k + i) == sum) {
                    s.add(new ArrayList<>(Arrays.asList(k, i)));
                }
            }
        }
        System.out.println(s);
    }

    public static void findPairsWithGivenSumSortedArray(int[] arr, int sum) {

        int l = 0;
        int h = arr.length - 1;
        while (l < h) {
            if (arr[l] + arr[h] > sum) {
                h--;
            } else if (arr[l] + arr[h] < sum) {
                l++;
            } else if (arr[l] + arr[h] == sum) {
                System.out.println("Pair of Sum " + sum + " is " + "(" + arr[l] + ", " + arr[h] + ")");
                l++;
                h--;
            }
        }
    }
}
