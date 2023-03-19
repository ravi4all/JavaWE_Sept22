package ArrayStrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    static String reverse(String str) {
        // Reverse String
    }

    static String reverseP2(String str) {
        str = str.trim();   // remove leading and trailing spaces
        // str = "hello how are you";
        String wordArr[] = str.split(" ");
        // wordArr = {"hello", "how", "are", "you"};
        List<String> wordList = Arrays.asList(wordArr);
        Collections.reverse(wordList);
        // wordArr = {"you", "are", "how", "hello"}
        return String.join(" ", wordList);
        // "you are how hello"
    }

    public static void main(String[] args) {
        String str = "the sky is blue";
        String word = "";
        String result = "";
        for(int i = str.length()-1; i >= 0; i--) {
            char singleChar = str.charAt(i);
            word += singleChar;
            if(singleChar == ' ') {
                result += reverse(word);
            }
        }
        System.out.println(result);
    }
}
