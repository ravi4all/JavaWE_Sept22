package Recursion;

public class ArmStrongNumber {

    static boolean isArmstrong(int num, int temp, int result) {
        if(num == 0) {
            if(result == temp) {
                return true;
            }
            return false;
        }
        
        int rem = num % 10;
        result += Math.pow(rem, 3);
        num = num / 10;
        return isArmstrong(num, temp, result);
    }

    public static void main(String[] args) {
        int num = 153;
        int copy = num;
        boolean ans = isArmstrong(num, copy, 0);
        System.out.println(ans);
    }
}
