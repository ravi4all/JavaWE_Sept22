package DP;

public class Knapsack {

    static int ks(int []weights, int []values, int max, int index) {
        if(max == 0 || index == weights.length) {
            return 0;
        }
        if(weights[index] > max) {
            return ks(weights, values, max, index + 1);
        }
        else {
            int option_1 = values[index] + ks(weights, values, max - weights[index], index + 1);
            int option_2 = ks(weights, values, max, index + 1);
            return Math.max(option_1, option_2);
        }
    }
    public static void main(String[] args) {
        int wt[] = {10,20,30};
        int val[] = {80,100,120};
        int cap = 50;
        ks(wt, val, cap, 0);
    }
}
