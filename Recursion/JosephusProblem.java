package Recursion;

public class JosephusProblem {

    static int game(int n, int k) {
        int index = 1;
        int result = 0;
        while(index <= n) {
            result = (result + k) % index;
            index++;
        }
        return result + 1;
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int res = game(n, k);
        System.out.println(res);
    }
}
