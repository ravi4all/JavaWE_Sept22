package DP;

import java.util.ArrayList;

public class DiceCount {
    static int counter = 0;
    static int countWays(int currentCount, int target, int cache[]) {
        counter++;
        // Positive Base Case
        if(currentCount == target) {
            return 1;
        }
        // Negative Base Case
        if(currentCount > target) {
            return 0;
        }
        if(cache[currentCount] != 0) {
            return cache[currentCount];
        }
        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
            int newValue = currentCount + dice;
            count += countWays(newValue, target, cache);
        }
        cache[currentCount] = count;
        return count;
    }

    static int countWaysTabulation(int start, int end) {
        int cache[] = new int[end + 1];
        cache[end] = 1;
        for(int i = end - 1; i >= 0; i--) {
            int count = 0;
            for(int dice = 1; dice <= 6 && dice + i < cache.length; dice++) {
                count += cache[dice + i];
                System.out.println("Count is : " + count);
            }
            cache[i] = count;
        }
        return cache[start];
    }

    public static void main(String[] args) {
        int target = 10;
        int cache[] = new int[target + 1];
        // int count = countWays(0, target, cache);
        int count = countWaysTabulation(0, target);
        System.out.println("Total ways : " + count);
        System.out.println("Total Calls : " + counter);
    }
}
