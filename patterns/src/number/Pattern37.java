package number;

public class Pattern37 {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }

            System.out.println();
        }
    }
}
