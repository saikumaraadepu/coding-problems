package character;

public class Pattern74 {

    public static void main(String[] args) {
        char c = 'Z';
        for (int i = 1; i <= 7; i++) {

            for (int j = 7; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print((char)(c - j + 1) + " ");
            }

            System.out.println();
        }
    }
}
