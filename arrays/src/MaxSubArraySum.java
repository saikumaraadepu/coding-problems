public class MaxSubArraySum {

    public static void main(String[] args) {
        int[] arr = {1, 2, -5, 4, 3, 8, 5};

        System.out.println(findMaxSubArraySum(arr));
    }

    public static int findMaxSubArraySum(int[] arr) {

        int sum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (sum + arr[i] > arr[i]) {
                sum = sum + arr[i];
            } else {
                sum = arr[i];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}
