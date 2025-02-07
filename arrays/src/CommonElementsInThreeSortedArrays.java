public class CommonElementsInThreeSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {3, 4, 5, 6, 7};
        int[] arr3 = {5, 6, 7, 8, 9};

        findCommonElementsInThreeSortedArrays(arr1, arr2, arr3);

    }

    public static void findCommonElementsInThreeSortedArrays(int[] arr1, int[] arr2, int[] arr3) {

        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        while (a1 < arr1.length && a2 < arr2.length && a3 < arr3.length) {
            if (arr1[a1] == arr2[a2] && arr2[a2] == arr3[a3]) {
                System.out.println(arr1[a1]);
                a1++;
                a2++;
                a3++;
            } else if (arr1[a1] > arr2[a2]) {
                a2++;
            } else if (arr2[a2] > arr3[a3]) {
                a3++;
            } else {
                a1++;
            }
        }
    }
}
