package number;

public class Pattern41 {

    public static void main(String[] args) {

        for (int i = 9; i >= 1; i--)
        {
            for (int j = 9; j >= i; j--)
            {
                System.out.print(j+" ");
            }

            for (int j = 1; j < (2*i)-1; j++)
            {
                System.out.print(i+" ");
            }

            for (int j = i+1; j <= 9; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }

        for (int i = 2; i <= 9; i++)
        {
            for (int j = 9; j >= i; j--)
            {
                System.out.print(j+" ");
            }

            for (int j = 1; j < (2*i)-1; j++)
            {
                System.out.print(i+" ");
            }

            for (int j = i+1; j <= 9; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}