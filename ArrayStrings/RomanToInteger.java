package ArrayStrings;

import java.util.HashMap;

public class RomanToInteger {
    static HashMap<String, Integer> map = new HashMap<>();
    static {
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
    }
    static int roman(String str) {
        int sum = 0;
        int i = 0;
        while(i < str.length()) {
            String current = str.substring(i, i+1);
            int currentValue = map.get(current);
            int nextValue = 0;
            if(i+1 < str.length()) {
                String next = str.substring(i+1, i+2);
                nextValue = map.get(next);
            }
            if(currentValue < nextValue) {
                sum += (nextValue - currentValue);
                i += 2;
            }
            else {
                sum += currentValue;
                i += 1;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        roman("LVIII");
    }
}
