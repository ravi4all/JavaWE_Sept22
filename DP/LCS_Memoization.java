package DP;

public class LCS_Memoization {
    static int lcs(String s1, String s2, int m, int n, int cache[][]) {
        // if(s1.length() == 0 || s2.length() == 0) {
        //     return 0;
        // }

        if(m == 0 || n == 0) {
            return 0;
        }

        // Memoization
        if(cache[m-1][n-1] != 0) {
            return cache[m-1][n-1];
        }

        if(s1.charAt(m-1) == s2.charAt(n-1)) {
            cache[m-1][n-1] = 1 + lcs(s1, s2, m-1, n-1, cache);
            return cache[m-1][n-1];
        }
        else {
            int result_1 = lcs(s1, s2, m, n-1, cache);
            int result_2 = lcs(s1, s2, m-1, n, cache);
            cache[m-1][n-1] = Math.max(result_1, result_2);
        }
        return cache[m-1][n-1];

    }
    public static void main(String[] args) {
        String str_1 = "qpqrr";
        String str_2 = "pqprqrp";
        int m = str_1.length();     // m = 5
        int n = str_2.length();     // n = 7
        int cache[][] = new int[m+1][n+1];  // 6 x 8
        lcs(str_1, str_2, m, n, cache);
    }
}
