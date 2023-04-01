package ArrayStrings;

public class PatternMatchingRabinKarp {
    public static void main(String[] args) {
        String str = "ABCDBCAABCCAB";
        String pat = "ABC";
        int n = str.length();
        int m = pat.length();
        int patternHash = 0;
        int stringHash = 0;
        int d = 5;
        int q = 13;

        for(int i = 0; i < m; i++) {
            patternHash = (patternHash * d + pat.charAt(i)) % q;
            stringHash = (stringHash * d + str.charAt(i)) % q;
        }

        for(int i = 0; i < n - m; i++) {
            if(patternHash == stringHash) {
                int j;
                for(j = 0; j < m; j++) {
                    if(str.charAt(i + j) != pat.charAt(j)) {
                        break;
                    }
                }
                if(j == m) {
                    System.out.println("Pattern Found at : " + i);
                }
            }
            if(i < n - m) {
                // remove prev char hash
                stringHash = stringHash - str.charAt(i) * d;
                // add next char hash
                stringHash = (stringHash * d + str.charAt(i + m)) % q;
                if(stringHash < 0) {
                    stringHash = stringHash + q;
                }
            }
        }
    }
}
