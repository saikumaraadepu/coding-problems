package star;

public class Pattern46 {

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
    }
}
