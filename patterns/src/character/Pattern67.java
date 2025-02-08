package character;

public class Pattern67 {

    public static void main(String[] args) {

        for (int i=1; i <= 7; i++) {
            char c = 'Z';
            for (int j = 1; j <= i; j++) {
                System.out.print(c-- + " ");
            }
            System.out.println();
        }
    }
}
