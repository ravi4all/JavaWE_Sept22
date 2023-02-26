package Arrays1D;

public class RotateArrayByKP2 {
    void reverse(int i, int j, int arr[]) {
        int temp;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(0,n-k-1, nums);
        reverse(n-k,n-1, nums);
        reverse(0,n-1, nums);
    }
}
