package Arrays1D;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int temp = arr[n-1];
        for(int i = 0; i < n-1; i++) {
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }
}
