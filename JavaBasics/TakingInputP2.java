import java.util.Scanner;

public class TakingInputP2 {
    public static void main(String[] args) {
        // System.in
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Enter your age : ");
        byte age = sc.nextByte();

        System.out.println("Name is :: " + name);
        System.out.println("Age is :: " + age);
        sc.close();
    }
}