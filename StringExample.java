import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        
        /*
         * char firstChar = name.charAt(0);
         * String firstCharUpper = String.valueOf(firstChar).toUpperCase();
         * String remainingString = name.substring(1).toLowerCase();
         * name = firstCharUpper + remainingString;
         */
        
        String nameArr[] = name.split(" ");
        //["ram","kumar","sharma"]
        String fullName = "";
        for(String n : nameArr) {
            char firstChar = n.charAt(0);
            String firstCharUpper = String.valueOf(firstChar).toUpperCase();
            String remainingString = n.substring(1).toLowerCase();
            fullName = fullName + firstCharUpper + remainingString + " ";
            
        }
        
        System.out.println("Name is : " + fullName);

        scanner.close();
    }

}
