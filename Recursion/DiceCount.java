package Recursion;

import java.util.ArrayList;

public class DiceCount {
    static ArrayList<String> game(int currentCount, int target) {

        // Positive Base Case
        if(currentCount == target) {
            ArrayList<String> t = new ArrayList<>();
            t.add("");
            return t;
        }

        // Negative Base Case
        if(currentCount > target) {
            ArrayList<String> t = new ArrayList<>();
            return t;
        }
        
        ArrayList<String> temp = new ArrayList<>();
        for(int dice = 1; dice <= 6; dice++) {
            int newValue = currentCount + dice;
            ArrayList<String> result = game(newValue, target);
            for(String s : result) {
                temp.add(dice + s);
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        ArrayList<String> result = game(0, 7);
        System.out.println(result);
    }
}
