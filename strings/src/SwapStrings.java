public class SwapStrings {

    public static void main(String[] args) {

        String s = "Saikumar";
        String s1 = "Adepu";
        swapStrings(s, s1);

    }

    public static void swapStrings(String s, String s1) {

        System.out.println("S: " + s);
        System.out.println("S1: " + s1);
        s = s + s1;
        s1 = s.substring(0, s.length() - s1.length());
        s = s.substring(s1.length());
        System.out.println("After Swap");
        System.out.println("S: " + s);
        System.out.println("S1: " + s1);
    }
}
