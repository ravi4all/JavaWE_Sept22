package Recursion;

public class RecursionDemo {

    static int fact(int n) {
        // Base Case / Termination Case
        if(n == 0) {
            return 1;
        }

        // Small Problem
        return fact(n - 1) * n;
    }
    public static void main(String[] args) {
        int result = fact(5);
        System.out.println(result);
    }
}