package number;

public class Pattern14 {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {

            for (int j=2*7-i; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
