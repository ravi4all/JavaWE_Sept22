public class IfElse {
    public static void main(String[] args) {
        // int x = 12;
        // if(x % 2 == 0) {
        //     System.out.println("Number is even...");
        // }
        // else {
        //     System.out.println("Number is odd...");
        // }

        int x = 12, y = 20, z = 30;
        // Logical Operator - &&, ||, !
        if(x > y && x > z) {
            System.out.println("X is greatest...");
        }
        else if(y > x && y > z) {
            System.out.println("Y is greatest...");
        }
        else {
            System.out.println("Z is greatest...");
        }

    }
}
