import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 6, 8, 9, 10};
        int[] arr2 = {3, 5, 7, 11};

        System.out.println(Arrays.toString(mergeTwoSortedArrays(arr1, arr2)));

    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        while (a1 < arr1.length && a2 < arr2.length) {

            if (arr1[a1] < arr2[a2]) {
                arr3[a3++] = arr1[a1++];
            } else {
                arr3[a3++] = arr2[a2++];
            }
        }

        while (a1 < arr1.length) {
            arr3[a3++] = arr1[a1++];
        }

        while (a2 < arr2.length) {
            arr3[a3++] = arr2[a2++];
        }
        return arr3;
    }
}
