package number;

public class Pattern34 {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j <= 2 * i - 1; j++) {

                if (i == j) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
