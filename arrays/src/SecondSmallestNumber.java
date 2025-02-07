public class SecondSmallestNumber {
    public static void main(String[] args) {

        int[] arr = {-1,  1, 4, 3, 5, 7, 8, -1};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        System.out.println(findSecondSmallestNumber(arr));

    }

    public static int findSecondSmallestNumber(int[] arr) {

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int n : arr) {
            if (n < smallest) {
                secondSmallest = smallest;
                smallest = n;

            }
            if (n > smallest && n < secondSmallest) {
                secondSmallest = n;
            }
        }
        return secondSmallest;
    }
}
