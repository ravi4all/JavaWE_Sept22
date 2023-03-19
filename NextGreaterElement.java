package Arrays1D;

public class NextGreaterElement {
    static void approach_1(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            int j;
            for(j = i + 1; j < arr.length; j++) {
                if(arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if(j == arr.length) {
                System.out.print(-1 + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        approach_1(arr);
    }
}
