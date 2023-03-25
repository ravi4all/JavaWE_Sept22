package ArrayStrings;

public class LongestSubstring {
    static int length(String s) {
        int n = s.length();
        int res = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(helper(s, i, j)) {
                    res = Math.max(res, j-i+1);
                }
            }
        }
        return res;
    }

    static boolean helper(String s, int start, int end) {
        int[] charArr = new int[128];
        for(int i = start; i <= end; i++) {
            char c = s.charAt(i);
            charArr[c]++;
            if(charArr[c] > 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
