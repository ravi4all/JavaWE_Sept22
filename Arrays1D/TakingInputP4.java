import java.util.Scanner;

public class TakingInputP4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        // name = "john max cena"

        String[] nameArr = name.split(" ");
        // nameArr - {"john", "max", "cena"}

        String fullName = "";

        for(String n : nameArr) {
            // n = "john"
            // char firstChar = n.charAt(0);
            // firstChar = 'j'
            // type cast character to String
            // String firstLetter = String.valueOf(firstChar).toUpperCase();
            // firstLetter = "J"
            // String remString = name.substring(1).toLowerCase();
            // remString - ohn
            // fullName = fullName + firstLetter + remString + " ";
            // fullName - John
            // fullName - John Max
            // fullName - John Max Cena

            fullName += String.valueOf(n.charAt(0)).toUpperCase() + name.substring(1).toLowerCase() + " ";

        }
        
        System.out.println("Welcome : " + fullName);

        scanner.close();
    }
}
