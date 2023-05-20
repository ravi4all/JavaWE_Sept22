package DP;

public class FibSeries {

    // Memoization
    static int fib(int n, int cache[]) {
        if(n == 1 || n == 0) {
            return n;
        }
        if(cache[n] != 0) {
            return cache[n];
        }
        int first = fib(n - 1, cache);
        int second = fib(n - 2, cache);
        int sum = first + second;
        cache[n] = sum;
        return sum;
    }

    // Tabulation
    static int fibTabulation(int n, int cache[]) {
        // 0,1,1,2,3,5,8,13...
        cache[0] = 0;
        cache[1] = 1;
        for(int i = 2; i <= n; i++){
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int cache[] = new int[n+1];
        fib(n, cache);
    }
}
