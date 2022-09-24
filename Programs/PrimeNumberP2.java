package Programs;

public class PrimeNumberP2 {
    public static void main(String[] args) {
        int n = 997;
        boolean prime = true;

        if(n % 2 == 0 || n % 3 == 0) {
            prime = false;
        }

        int iter = 0;
        for(int i = 5; i * i < n; i+=6) {
            iter++;
            if(n % i == 0 || n % i + 2 == 0) {
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
        System.out.println("Number of iterations : " + iter);
    }
}
