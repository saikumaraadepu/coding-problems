package character;

public class Pattern71 {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            char c = 'p';
            for (int j = 7; j >= i; j--) {
                System.out.print(c++ + " ");
            }
            System.out.println();
        }
    }
}
