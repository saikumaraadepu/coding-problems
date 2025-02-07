import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 18;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    public static int[] twoSum(int[] arr, int target) {

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            if (arr[l] + arr[r] == target) {
                return new int[]{l, r};
            } else if (arr[l] + arr[r] < target) {
                l++;
            }
            r--;
        }
        return new int[]{};
    }
}
