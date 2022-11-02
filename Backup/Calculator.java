public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to basic calc...");
        // Wrapper Class - Integer
        int fnum = Integer.parseInt(args[0]);
        int snum = Integer.parseInt(args[1]);
        int result = fnum + snum;
        System.out.println("Result is : " + result);
    }
}
