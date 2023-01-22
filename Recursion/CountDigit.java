package Recursion;

public class CountDigit {

    // static void countDigit(int num, int count) {
    //     if(num == 0) {
    //         System.out.println(count);
    //         return;
    //     }
    //     countDigit(num/10, count+1);
    // }

    // static int countDigit(int num, int count) {
    //     if(num == 0) {
    //         return count;
    //     }
    //     // Small Problem
    //     return countDigit(num/10, count+1);
    // }

    static int countDigit(int num) {
        if(num == 0) {
            return 0;
        }
        // Small Problem
        return 1 + countDigit(num/10);
    }

    public static void main(String[] args) {
        int num = 1234;
        int res = countDigit(num);
        System.out.println(res);
    }
}
