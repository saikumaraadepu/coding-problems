import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7};

        reverseAnArray(arr);
    }

    public static void reverseAnArray(int[] arr) {

        int l = 0;
        int r = arr.length - 1;
        int t;

        while (l < r) {
            t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
