import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String s = "saikumar";
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        String s1 = " adepu";
        System.out.println(s.concat(s1));
        System.out.println(s.equals(s1));
        System.out.println(s.replace('s', 'S'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.substring(0,3));
        String s2 = "hello%hi%what";
        String[] arr = s2.split("%");
        System.out.println(Arrays.toString(arr));
        int s3 = 100;
        int s4 = 43;
        System.out.println(String.valueOf(s3) + String.valueOf(s4));
        System.out.println(s.startsWith("s"));
        System.out.println(s.endsWith("s"));
        System.out.println(s1.trim());
        String s5 = s.intern();
        System.out.println(s == s5);
        char[] arr1 = s.toCharArray();
        System.out.println(Arrays.toString(arr1));
    }
}
