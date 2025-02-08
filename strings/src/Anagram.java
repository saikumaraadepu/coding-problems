import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String s = "sai";
        String s1 = "ias";

        System.out.println(isAnagram(s, s1));

    }

    public static boolean isAnagram(String s, String s1) {

        if (s.length() != s1.length()) return false;

        char[] ch = s.toCharArray();
        char[] ch1 = s1.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        return Arrays.equals(ch, ch1);
    }
}
