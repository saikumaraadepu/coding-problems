package number;

public class Pattern39 {
    public static void main(String[] args) {

        char c = 'A';

        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 6; j >= i; j--) {
                System.out.print(c);
            }

            c++;

            System.out.println();
        }
    }
}
