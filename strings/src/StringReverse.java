public class StringReverse {

    public static void main(String[] args) {

        String s = "saikumar";
        System.out.println(reverseString(s));
        System.out.println(reverseStringUsingCharArray(s));
    }

    public static String reverseString(String s){

        String s1 = "";

        for (int i=s.length()-1; i>=0;i--){

            s1+=s.charAt(i);
        }

        return s1;
    }

    public static String reverseStringUsingCharArray(String s){
        char[] cArr = s.toCharArray();

        int left = 0;
        int right = cArr.length-1;

        while(left<right){
            char temp = cArr[left];
            cArr[left] = cArr[right];
            cArr[right] = temp;
            left++;
            right--;
        }

        return new String(cArr);
    }
}
