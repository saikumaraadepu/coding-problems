package star;

public class Pattern50 {

    public static void main(String[] args) {

        for (int i = 7; i >= 1; i--) {

            for (int j = 1; j < 2 * i - 1; j++) {

                System.out.print(" ");
            }

            for (int j = 7; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 2 * i ; j++) {
                System.out.print(" ");
            }

            for (int j = 6; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
