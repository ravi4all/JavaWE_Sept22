package Programs;

public class EvenOdd {
    public static void main(String[] args) {
        int x = 12;
        // if(x % 2 == 0) {
        //     System.out.println("Even Number...");
        // }
        // else {
        //     System.out.println("Odd Number...");
        // }

        if((x & 1) == 1) {
            System.out.println("Odd Number...");
        }
        else {
            System.out.println("Even Number...");
        }

    }
}
