package ArrayStrings;

public class PalindromeString {

    static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
    }

    static boolean isPalindrome_2(String str) {
        int begin = 0;
        int endIndex = str.length() - 1;
        while(begin < endIndex) {
            if(str.charAt(begin) != str.charAt(endIndex)) {
                return false;
            }
            begin++;
            endIndex--;
        }
        return true;
    }

    public static void main(String[] args) {
        
    }
}
