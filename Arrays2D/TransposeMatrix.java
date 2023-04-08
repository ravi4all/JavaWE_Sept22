package Arrays2D;

public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {5,6,7},
            {3,6,2}
        };
        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println("Before Transpose...");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }

        int temp = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = i+1; j < arr[i].length; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            System.out.println();
        }

        System.out.println("After Transpose...");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
    }
}
