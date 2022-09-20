public class IfElse {
    public static void main(String[] args) {
        // int x = 12;
        // int y = 45;
        // if(x > y) {
        //     System.out.println("X is greater...");
        // }
        // else {
        //     System.out.println("Y is greater...");
        // }

        int x = 12, y = 20, z = 30;

        if(x > y && x > z) {
            System.out.println("X is greater...");
        }
        else if (y > x && y > z) {
            System.out.println("Y is greater...");
        }
        else {
            System.out.println("Z is greatest...");
        }
    }
}
