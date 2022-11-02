import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        // int x = System.in.read();
        // System.out.println("X is : " + x);

        // Scanner - Buffer, used to store input coming from any source
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Name is : " + name);

        System.out.println("Enter Age : ");
        int age = scanner.nextInt();
        System.out.println("Age is : " + age);
    }
}
