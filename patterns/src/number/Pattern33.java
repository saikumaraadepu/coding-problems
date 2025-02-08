package number;

public class Pattern33 {

    public static void main(String[] args) {

        int n = 1;

        for (int i = 1; i <= 6; i++) {

            if (i % 2 == 1) {

                for (int j = 1; j <= i; j++) {
                    System.out.print(n + " ");
                    n++;
                }
            } else {

                int s = n + i - 1;
                for (int j = s; j >= n; j--) {
                    System.out.print(j + " ");
                }
                n+=i;
            }
            System.out.println();
        }
    }
}
