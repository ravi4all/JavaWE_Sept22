package Arrays1D;

public class WindowSlidingTechnique {
    static void approach_1(int arr[], int k) {
        int maxSum = 0;
        for(int i = 0; i + k - 1 < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < k; j++) {
                sum += arr[i + j];
            }
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("Max Sum : " + maxSum);
    }

    static void approach_2(int arr[], int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        for(int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("Max Sum : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1,40,30,10,20,5};
        int k = 3;
        approach_1(arr, k);
    }
}
