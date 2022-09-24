import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // for(initialization; condition; inc/dec) {
        //     Logic
        // }
        // for(int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
        scanner.close();
    }
}
