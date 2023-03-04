package Arrays1D;

public class ZigZag {
    public static void main(String[] args) {
        int arr[] = {4, 3, 7, 8, 6, 2, 1};
        // {3, 4, 7, 8, 6, 2, 1}
        // {3, 7, 4, 8, 6, 2, 1}
        // o/p {3, 7, 4, 8, 2, 6, 1}

        int temp;
        boolean flag = true;
        for(int i = 0; i < arr.length - 1; i++) {
            if(flag) {
                if(arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            else {
                if(arr[i] < arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag = !flag;
        }
    }
}
