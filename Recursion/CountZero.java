package Recursion;

public class CountZero {

    static int count(int num, int c) {
        // Base Case
        if(num == 0) {
            return c;
        }
        // Processing Logic
        if(num % 10 == 0) {
            c++;
        }
        // Small Problem
        return count(num/10, c);
    }

    public static void main(String[] args) {
        int res = count(120506701, 0);
        System.out.println(res);
    }
}
