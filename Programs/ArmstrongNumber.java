package Programs;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        // store copy of number
        int temp = num;
        while(num % 10 != 0) {
            int rem = num % 10;
            sum += Math.pow(rem, 3);
            num = num / 10;
        }
        if(sum == temp) {
            System.out.println("Armstrong...");
        }
        else {
            System.out.println("Not Armstrong...");
        }
    }
}
