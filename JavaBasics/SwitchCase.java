import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice : ");
        int ch = sc.nextInt();

        System.out.println("Enter first num : ");
        int fnum = sc.nextInt();
        System.out.println("Enter second num : ");
        int snum = sc.nextInt();
        int res = 0;
        switch(ch) {
            case 1:
                res = fnum + snum;
                break;
            case 2:
                res = fnum - snum;
                break;
            case 3:
                res = fnum / snum;
                break;
            case 4:
                res = fnum * snum;
                break;
            default:
                System.out.println("Invalid Choice...");
        }
        System.out.println("Result is : " + res);
        sc.close();
    }
}
