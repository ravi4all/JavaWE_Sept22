import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name : ");
        // reads one byte at a time
        // returns int (ASCII) of any input
        // int name = System.in.read();
        
        Scanner scanner = new Scanner(System.in);
        // nextLine - used to take input in string type
        // it reads input till \n
        String name = scanner.nextLine();
        System.out.println("Welcome : " + name);

        scanner.close();
        
    }
}
