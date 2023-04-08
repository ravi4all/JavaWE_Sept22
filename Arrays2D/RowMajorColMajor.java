package Arrays2D;

public class RowMajorColMajor {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,0,0},
            {1,7,3,8},
            {5,6,8,1}
        };
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }

        System.out.println("=================");

        for(int j = 0; j < cols; j++) {
            for(int i = 0; i < rows; i++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
    }
}
