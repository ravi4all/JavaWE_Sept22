package Programs;

public class SumNNaturalNum {
    public static void main(String[] args) {
        int n = 10;
        // int sum = 0;
        // for(int i = 1; i <= n; i++) {
        //     sum += i;
        // }
        
        int sum = n * (n + 1) / 2;
        System.out.println("Sum is :: " + sum);

    }
}
