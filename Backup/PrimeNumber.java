public class PrimeNumber {
    public static void main(String[] args) {
        int n = 25;
        boolean prime = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                // System.out.println("Not Prime Number...");
                prime = false;
                break;
            }
        }
        if(prime) {
            System.out.println("Number is prime...");
        }
        else {
            System.out.println("Number is not prime...");
        }
    }
}
