public class DeleteAnElFromArrayAtSpecifiedPosition {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int pos = 2;

        deleteAnElFromArrayAtSpecifiedPosition(pos, arr);

    }

    public static void deleteAnElFromArrayAtSpecifiedPosition(int pos, int[] arr) {

        if (pos < 0 || pos >= arr.length) {
            System.out.println("Invalid Position: " + pos);
            return;
        }

        for (int i = pos; i < arr.length - 1; i++) {

            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;

        System.out.println("Array after update: ");

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
