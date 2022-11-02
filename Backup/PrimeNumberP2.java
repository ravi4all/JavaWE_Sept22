public class PrimeNumberP2 {
    public static void main(String[] args) {
        int n = 997;
        boolean prime = true;
        int iterations = 0;
        // for(int i = 2; i < n/2; i++) {
        //     iterations++;
        //     if(n % i == 0) {
        //         // System.out.println("Not Prime Number...");
        //         prime = false;
        //         break;
        //     }
        // }

        for(int i = 2; i * i < n; i++) {
            iterations++;
            if(n % i == 0) {
                // System.out.println("Not Prime Number...");
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
