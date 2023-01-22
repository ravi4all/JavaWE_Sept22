package Recursion;

public class PowerOfANumber {

    // Using For Loop
    static void powerCalc(int num, int pow) {
        int result = 1;
        for(int i = 1; i <= pow; i++) {
            result = result * num;
        }
        System.out.println("Result is : " + result);
    }

    // Using Recursion
    static int powerCalcRec(int num, int pow) {
        if(pow == 0) {
            return 1;
        }
        int result = powerCalcRec(num, pow-1);
        result = result * num;
        return result;
    }

    // Using Recursion
    // static int powerCalcRec(int num, int pow) {
    //     if(pow == 0) {
    //         return 1;
    //     }
    //     return num * powerCalcRec(num, pow - 1);
    // }

    public static void main(String[] args) {
        int num = 2;
        int pow = 6;
        int res = powerCalcRec(num, pow);
        System.out.println(res);
    }
}
