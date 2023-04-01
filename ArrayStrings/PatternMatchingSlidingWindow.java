package ArrayStrings;

public class PatternMatchingSlidingWindow {
    public static void main(String[] args) {
        String str = "ABCDAABCCB";
        String pat = "ABC";
        int n = str.length();
        int m = pat.length();
        for(int i = 0; i < n - m; i++) {
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
    }
}
