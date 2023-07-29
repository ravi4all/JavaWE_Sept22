package Bits;

public class KthSetBit {
    void kthBit(int n, int k) {
        if((n & (1 << (k-1))) != 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        
    }
}
