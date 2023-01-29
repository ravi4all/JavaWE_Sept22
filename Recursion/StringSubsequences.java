package Recursion;

import java.util.ArrayList;

public class StringSubsequences {

    // ravi, avi, vi, i, ""
    static ArrayList<String> subsequences(String str) {
        // Base Case
        if(str.length() == 0) {
            ArrayList<String> emptyList = new ArrayList<>();
            emptyList.add("");
            return emptyList;
        }

        // r, a, v, i
        char currentChar = str.charAt(0);
        // avi, vi, i, ""
        String remainingString = str.substring(1);
        ArrayList<String> temp = subsequences(remainingString);
    
        ArrayList<String> result = new ArrayList<>();
        for(String s : temp) {
            result.add(s);
            result.add(currentChar + s);
        }
        return result;

    }

    public static void main(String[] args) {
        String str = "ravi";
        subsequences(str);
    }
}
