package Programs;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 997;
        boolean prime = true;
        int iter = 0;
        for(int i = 2; i < n/2; i++) {
            iter++;
            if(n % i == 0) {
                // System.out.println("Number is not prime...");
                prime = false;
                break;
            }
            // else {
            //     System.out.println("Number is prime...");
            // }
        }
        if(prime) {
            System.out.println("Number is prime...");
        }
        else {
            System.out.println("Number is not prime...");
        }
        System.out.println("Number of iterations : " + iter);
    }   
}
