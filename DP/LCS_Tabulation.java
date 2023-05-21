package DP;

public class LCS_Tabulation {

    static int lcs(String first, String second, int m, int n) {
        int matrix[][] = new int[m+1][n+1];
        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == 0 || j == 0) {
                    matrix[i][j] = 0;
                }
                else {
                    if(first.charAt(i - 1) == second.charAt(j - 1)) {
                        matrix[i][j] = 1 + matrix[i-1][j-1];
                    }
                    else {
                        matrix[i][j] = Math.max(matrix[i][j-1], matrix[i-1][j]);
                    }
                }
            }
        }
        return matrix[m][n];
    }
    public static void main(String[] args) {
        String str_1 = "ABCDBQFT";
        String str_2 = "BDFT";
        int m = str_1.length();
        int n = str_2.length();
        lcs(str_1, str_2, m, n);
    }
}
