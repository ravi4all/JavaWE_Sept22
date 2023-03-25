package ArrayStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class RemoveDuplicate {

    static void remove(String s) {
        Stack<Character> st = new Stack<>();
        HashSet<Character> set = new HashSet<>();
        // stores the last occurrence of each character
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!set.contains(c)) {
                while(!st.isEmpty() && c < st.peek() && map.get(st.peek()) > i) {
                    set.remove(st.pop());
                }
                set.add(c);
                st.push(c);
            }
        }
        System.out.println(set);
        System.out.println(map);
        System.out.println(st);
    }
    public static void main(String[] args) {
        remove("cbacdcbc");
    }
}
