package Recursion;

public class P1_Recursion {
    // Tail Recursion
    static void show(int n) {
        // Base Case
        if(n == 0) {
            return;
        }

        // Processing Logic
        System.out.println(n);

        // Small Problem
        show(n - 1);
    }

    // Head Recursion
    static void show_1(int n) {
        // Base Case
        if(n == 0) {
            return;
        }

        // Small Problem
        show_1(n - 1);

        // Processing Logic
        System.out.println(n);

    }

    // Linear Recursion
    static void show_2(int n) {
        // Base Case
        if(n == 0) {
            return;
        }

        // Processing Logic
        System.out.println(n);

        // Small Problem
        show_2(n - 1);

        // Processing Logic
        System.out.println(n);

    }
    
    public static void main(String[] args) {
        // show(5);
        show_2(5);
    }
}
