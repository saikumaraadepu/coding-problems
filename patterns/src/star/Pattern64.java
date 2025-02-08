package star;

public class Pattern64 {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {

            for (int j = 7; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print((j == 1 || i == j) ? "* " : "  ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = 6; j >= i; j--) {
                System.out.print((j == 6 || i == j) ? "* " : "  ");
            }

            System.out.println();
        }
    }
}
