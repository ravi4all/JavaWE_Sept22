package Programs;

import java.util.Date;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your msg : ");
        String msg = scanner.nextLine();
        if(msg.equals("hello") || msg.equals("hi") || msg.equals("hey")) {
            System.out.println("Hello User");
        }
        else if(msg.equals("tell me date") || msg.equals("date") || msg.equals("what's the date")) {
            Date date = new Date();
            System.out.println("Date is : " + date);
        }
        else {
            System.out.println("I don't Understand...");
        }
        scanner.close();
    }
}
