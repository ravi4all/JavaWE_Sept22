package Recursion;

import java.util.ArrayList;

public class StringPermutations {

    static ArrayList<String> permutations(String str) {
        // Base Case
        if(str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");   // {""}
            return list;
        }
        char currentChar = str.charAt(0);   //a, b, c
        String remString = str.substring(1);    // bc, c, ""
        ArrayList<String> temp = permutations(remString);   // {""}
        ArrayList<String> result = new ArrayList<>();

        for(String s : temp) {
            for(int i = 0; i <= s.length(); i++) {
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i, currentChar);
                result.add(sb.toString());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "abc";
        permutations(str);
    }
}
