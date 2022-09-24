package Programs;

public class GCD_LCM {
    public static void main(String[] args) {
        int n1 = 46, n2 = 18;
        int copy_n1 = n1, copy_n2 = n2;
        while(n1 % n2 != 0) {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        System.out.println("HCF is : " + n2);
        int lcm = (copy_n1 * copy_n2) / n2;
        System.out.println("LCM is : " + lcm);

    }
}
