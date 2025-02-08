public class WordCount {

    public static void main(String[] args) {

        String s = "  Saikumar      Adepu   ";

        System.out.println(wordCount(s));
    }

    public static int wordCount(String s){
        return (s.trim().split("\\s+")).length;
    }
}
