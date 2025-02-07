public class PeakElementInArray {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 7, 5};

        System.out.println(findPeakElementInArray(arr));

    }

    public static int findPeakElementInArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return arr[left];
    }
}
