package Arrays2D;

public class ToeplitzMatrix {

    static boolean toeplitz(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i = 0; i < rows-1; i++) {
            for(int j = 0; j < cols-1; j++) {
                if(arr[i][j] != arr[i+1][j+1]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
