package character;

public class Pattern79 {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {

            char c = 'A';

            for (int j = 1; j <= i; j++) {
                System.out.print(c++ + " ");
            }

            System.out.println();
        }

        for (int i = 1; i <= 6; i++) {

            char c = 'A';

            for (int j = 6; j >= i; j--) {
                System.out.print(c++ + " ");
            }

            System.out.println();
        }
    }
}
