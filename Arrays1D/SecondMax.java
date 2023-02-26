// package Arrays1D;

public class SecondMax {

    static void solution(int arr[]) {
        int max = arr[0];
        int secondMax = -1;
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if(arr[i] != max) {
                if(arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("Second Max : " + secondMax);
    }

    public static void main(String[] args) {
        // int arr[] = {2,5,7,11,6,8};
        int arr[] = {12,5,7,11,6,8};
        solution(arr);
    }
}
