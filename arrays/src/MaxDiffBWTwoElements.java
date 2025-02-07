public class MaxDiffBWTwoElements {

    public static void main(String[] args) {

        int[] arr = {7, 9, 5, 6, 13, 2};

        System.out.println(findMaxDiffBWTwoElements(arr));

    }

    public static int findMaxDiffBWTwoElements(int[] arr) {

        int maxDiff = arr[1] - arr[0];
        int minEl = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - minEl > maxDiff) {
                maxDiff = arr[i] - minEl;
            }

            if (arr[i] < minEl) {
                minEl = arr[i];
            }
        }

        return maxDiff;
    }
}
