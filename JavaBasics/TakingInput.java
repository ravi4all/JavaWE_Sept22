import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        // System.out.println("Enter your name : ");
        // int name = System.in.read();    // reads only one character at at time
        // and returns ASCII of the character
        // System.out.println("Name is : " + name);

        // creating object of Scanner class to hold input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ID : ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter Full Name : ");
        String fullName = scanner.nextLine();
        // String fullName = scanner.next();

        System.out.println("Enter Email ID : ");
        String email = scanner.nextLine();
        // String email = scanner.next();

        System.out.println("Enter Age : ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter Address : ");
        String address = scanner.nextLine();
        // String address = scanner.next();

        System.out.println("ID is : " + id);
        System.out.println("Name is : " + fullName);
        System.out.println("Email is : " + email);
        System.out.println("Age is : " + age);
        System.out.println("Address is : " + address);
        scanner.close();
    }
}
