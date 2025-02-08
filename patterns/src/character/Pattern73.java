package character;

public class Pattern73 {


    public static void main(String[] args) {
        char c = 'A';

        for (int i = 1; i <= 7; i++) {

            for (int j = i; j < 7; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print((char)(c + j - 1) + " ");
            }
            System.out.println();
        }
    }

}
