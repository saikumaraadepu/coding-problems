package number;

public class Pattern32 {

    public static void main(String[] args) {

        int n = 1;

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(n++ + " ");
            }

            System.out.println();
        }
    }
}
