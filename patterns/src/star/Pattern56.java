package star;

public class Pattern56 {

    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
//                System.out.print("(" + i + ", " + j + ")");
                System.out.print((j == 1 || i == 1 || j == 8 || i == 8) ? "* " : "  ");
            }
            System.out.println();
        }
    }
}
