public class Palindrome {

    public static void main(String[] args) {

        String s = "anwena";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {

        char[] cArr = s.toCharArray();

        int left = 0;
        int right = cArr.length - 1;

        while(left<right){
            if (cArr[left] !=cArr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
