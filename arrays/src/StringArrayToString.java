import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringArrayToString {

    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};
        String del = ";";

        System.out.println(stringArrayToString(del, arr));
        System.out.println(stringArrayToString1(del, arr));
        System.out.println(stringArrayToString2(del, arr));
    }

    //Using StringBuilder
    public static String stringArrayToString(String del, String[] arr) {

        StringBuilder sb = new StringBuilder();

        for (String a : arr) {
            sb.append(a);
            sb.append(del);
        }

        return sb.substring(0, Objects.equals(del, "") ? sb.length() : sb.length() - 1);
    }

    //Using String.join method
    public static String stringArrayToString1(String del, String[] arr) {
        return String.join(del, arr);
    }

    //Using Streams
    public static String stringArrayToString2(String del, String[] arr) {
        return Arrays.stream(arr).collect(Collectors.joining(del));
    }
}
