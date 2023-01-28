package Recursion;

import java.util.HashMap;

public class FreqCountRec {

    static HashMap<Character, Integer> getCount(String str, int index) {
        if (index == str.length()) {
            HashMap<Character, Integer> temp = new HashMap<>();
            return temp;
        }
        HashMap<Character, Integer> map = getCount(str, index + 1);
        char singleChar = str.charAt(index);
        if(map.get(singleChar) == null) {
            // if character doesn't exists then put character as a key and 1 as a value
            map.put(singleChar, 1);
        }
        else {
            int prevValue = map.get(singleChar);
            map.put(singleChar, prevValue + 1);
        }
        return map;
        
    }

    public static void main(String[] args) {
        String name = "ram sharma";
        HashMap<Character, Integer> output = getCount(name, 0);
        System.out.println(output);
    }
}
