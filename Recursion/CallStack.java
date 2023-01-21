package Recursion;

public class CallStack {
    static int x() {
        return 1;
    }
    static int y() {
        return 2 + x();
    }
    static int z() {
        return 3 + y();
    }
    public static void main(String[] args) {
        int result = z();
        System.out.println(result);
    }
}
