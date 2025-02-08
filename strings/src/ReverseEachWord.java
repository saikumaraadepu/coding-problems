public class ReverseEachWord {

    public static void main(String[] args) {
        String s = "Hi How Are You";

        System.out.println(reverseEachWord(s));
    }

    public static String reverseEachWord(String s) {
        String[] sArr = s.split(" ");

        int left = 0;
        int right = sArr.length-1;

        while(left<right){
            String t = sArr[left];
            sArr[left] = sArr[right];
            sArr[right] = t;
            left++;
            right--;
        }
        return String.join(" ", sArr);
    }
}
