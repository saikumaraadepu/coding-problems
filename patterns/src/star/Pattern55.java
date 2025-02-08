package star;

public class Pattern55 {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 7; j >= i; j--) {
//                System.out.print("(" + i + ", " + j + ")");
                System.out.print((i == 1 || i == j || j == 7) ? "* " : "  ");
            }

            System.out.println();
        }
    }
}
