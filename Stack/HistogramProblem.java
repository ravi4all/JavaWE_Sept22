package Stack;

public class HistogramProblem {

    static int getMax(int arr[]) {
        int n = arr.length;
        int result = 0;
        for(int i = 0; i < n; i++) {
            int current = arr[i];
            for(int j = i - 1; j >= 0; j--) {
                if(arr[j] >= arr[i]) {
                    current += arr[i];
                }
                else {
                    break;
                }
            }

            for(int j = i + 1; j < n; j++) {
                if(arr[j] >= arr[i]) {
                    current += arr[i];
                }
                else {
                    break;
                }
            }
            result = Math.max(result, current);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
    }
}
