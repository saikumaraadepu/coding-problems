public class Segregate0s1s {


    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1,};
        segregate0sAnd1s(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void segregate0sAnd1s(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Move left pointer until a 1 is found
            while (left < right && array[left] == 0) {
                left++;
            }

            // Move right pointer until a 0 is found
            while (left < right && array[right] == 1) {
                right--;
            }

            // Swap the elements at left and right if they haven't crossed
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }

}
