import java.util.Scanner;

public class TakingInputP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        // name = "john cena"
        char n = name.charAt(0);
        // n = 'j'
        // type cast character to String
        String firstLetter = String.valueOf(n).toUpperCase();
        // firstLetter = "J"
        String remString = name.substring(1).toLowerCase();
        // remString - ohn cena
        String fullName = firstLetter + remString;
        System.out.println("Welcome : " + fullName);

        scanner.close();
    }
}
