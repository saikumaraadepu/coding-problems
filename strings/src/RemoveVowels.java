public class RemoveVowels {

    public static void main(String[] args) {

        String s = "Saikumar";

        System.out.println(removeVowels(s));

    }

    public static String removeVowels(String s) {

        String vowels = "aeiouAEIOU";

        StringBuilder res = new StringBuilder();

        for (char c:s.toCharArray()){

            boolean isVowel = false;
            for (char c1:vowels.toCharArray()){
                if (c == c1) {
                    isVowel = true;
                    break;
                }
            }

            if (!isVowel) res.append(c);
        }
        return new String(res);
    }
}
