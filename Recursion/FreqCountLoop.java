package Recursion;

import java.util.HashMap;

public class FreqCountLoop {
    public static void main(String[] args) {
        String name = "ram sharma";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length(); i++) {
            // get one character at a time
            char singleChar = name.charAt(i);
            // continue if we get space
            if(singleChar == ' ') {
                continue;
            }
            // check if character already exists in map
            if(map.get(singleChar) == null) {
                // if character doesn't exists then put character as a key and 1 as a value
                map.put(singleChar, 1);
            }
            else {
                int prevValue = map.get(singleChar);
                map.put(singleChar, prevValue + 1);
            }
        }
        System.out.println(map);
    }
}
