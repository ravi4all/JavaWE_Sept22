public class CountDigitInNumber {
    public static void main(String[] args) {
        int n = 31312;
        int count = 0;
        while(n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Count is : " + count);
    }
}
