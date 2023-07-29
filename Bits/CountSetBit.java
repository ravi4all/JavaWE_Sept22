package Bits;

public class CountSetBit {

    // approach_1
    // int countSet(int n) {
    //     int count = 0;
    //     while(n > 0) {
    //         if((n & 1) == 1) {
    //             count++;
    //         }
    //         n = n/2;
    //     }
    //     return count;
    // }

    // approach_2
    int countSet(int n) {
        int count = 0;
        while(n > 0) {
            n = (n & (n - 1));
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        
    }
}
