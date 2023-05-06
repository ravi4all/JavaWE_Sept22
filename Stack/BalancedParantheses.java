package Stack;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParantheses {
    static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for(int i = 0; i < str.length(); i++) {
            if((str.charAt(i) == ']' || str.charAt(i) == '}' || str.charAt(i) == ')') && st.isEmpty()) {
                return false;
            }
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                st.push(str.charAt(i));
            }
            else {
                Character c = st.pop();
                c = map.get(c);
                if(c != str.charAt(i)) {
                    System.out.println("Invalid...");
                    return false;
                }

            }
            
        }
        if(st.isEmpty()) {
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        
    }
}
