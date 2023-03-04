package Arrays1D;

public class BuySellStock {

    static void approach_1(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(max < (arr[j] - arr[i])) {
                    max = arr[j] - arr[i];
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        approach_1(arr);
    }
}
