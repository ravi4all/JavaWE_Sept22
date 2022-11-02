public class PrimeNumberP3 {
    public static void main(String[] args) {
        int n = 997;
        boolean prime = true;
        int iterations = 0;

        if(n % 2 == 0 || n % 3 == 0) {
            prime = false;
        }

        for(int i = 5; i*i < n; i += 6) {
            iterations++;
            if(n % i == 0 || n % (i + 2) == 0) {
                prime = false;
                break;
            }
        }

        System.out.println("Took " + iterations + " iterations...");
        if(prime) {
            System.out.println("Number is prime...");
        }
        else {
            System.out.println("Number is not prime...");
        }
    }
}
