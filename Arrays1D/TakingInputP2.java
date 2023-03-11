import java.util.Scanner;

public class TakingInputP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your ID : ");
        int id = scanner.nextInt();     // 101\n
        // id = 101
        // scanner - \n

        scanner.nextLine(); // will eat up the remaining \n of scanner

        System.out.println("Enter your name : ");
        // nextLine - used to take input in string type
        // it reads input till \n
        String name = scanner.nextLine();
        // next - reads input till space
        // String name = scanner.next();

        System.out.println("Enter your city : ");
        String city = scanner.nextLine();

        System.out.println("Enter your age : ");
        byte age = scanner.nextByte();

        System.out.println("Enter your salary : ");
        double salary = scanner.nextDouble();

        System.out.println("Welcome : " + name);
        System.out.println("ID : " + id);
        System.out.println("City : " + city);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);

        scanner.close();
    }
}
