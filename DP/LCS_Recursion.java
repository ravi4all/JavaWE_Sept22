package DP;

public class LCS_Recursion {
    static int lcs(String s1, String s2) {
        if(s1.length() == 0 || s2.length() == 0) {
            return 0;
        }
        int count = 0;
        if(s1.charAt(0) == s2.charAt(0)) {
            count = 1 + lcs(s1.substring(1), s2.substring(1));
        }
        else {
            int result_1 = lcs(s1.substring(1), s2);
            int result_2 = lcs(s1, s2.substring(1));
            count = Math.max(result_1, result_2);
        }
        return count;

    }
    public static void main(String[] args) {
        
    }
}
