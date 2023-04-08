package Arrays2D;

public class RotateMatrix {
    static void rotate(int arr[][]) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr[i].length; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            System.out.println();
        }

        for(int row[] : arr) {
            for(int i = 0, j = arr.length - 1; i < arr.length/2; i++,j--) {
                temp = row[i];
                row[i] = row[j];
                row[j] = temp;
            }
        }

    }
    public static void main(String[] args) {
        
    }
}
