package number;

public class Pattern29 {

    public static void main(String[] args) {

        for (int i = 0; i <= 7; i++) {

            for (int j =0; j<= 7; j++) {
                System.out.print(i == j ? i : 0);
            }

            System.out.println();
        }
    }
}
