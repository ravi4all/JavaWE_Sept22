package ArrayStrings;

public class SubstringPalindrome {
    static boolean isPalindrome(String str) {
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
    static void solution(String str) {
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                String substr = str.substring(i, j);
                if(isPalindrome(substr)) {
                    System.out.println(substr);
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "abccbc";
        solution(str);
    }
}
