package number;

public class Pattern15 {

    public static void main(String[] args) {

        for (int i = 7; i >= 1; i--) {

            for (int j = 2 * 7 - i; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
