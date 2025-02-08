public class CharOccurence {

    public static void main(String[] args) {

        String s = "saikumar";

        char c = 'a';

        System.out.println(findCharOccurence(s, c));
    }

    public static int findCharOccurence(String s, char c) {

        char[] cArr = s.toLowerCase().toCharArray();

        int count = 0;

        for (char ch : cArr) {
            if (ch == c) {
                count++;
            }
        }

        return count;
    }
}
