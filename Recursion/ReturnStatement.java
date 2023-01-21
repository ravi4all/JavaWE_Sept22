package Recursion;

public class ReturnStatement {
    // void - function return nothing...
    static void show() {
        System.out.println("Show Function Called...");
        return;
    }

    static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    static int calc(int a, int b, String choice) {
        int z = 0;
        if(choice == "+") {
            z = a + b;
            return z;
        }
        else if(choice == "-") {
            z = a - b;
            return z;
        }
        else {
            return z;
        }
    }

    public static void main(String[] args) {
        int result = sum(4,2);
        System.out.println("Sum is : " + result);
    }
}
