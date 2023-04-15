package Arrays2D;

public class P7_SpiralMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int m = 4;
        int n = 4;
        int k = 0;
        int l = 0;
        // m -> number of rows
        // n -> number of cols
        // k -> starting row index
        // l -> starting col index
        int i;
        while(k < m && l < n) {
            // print first row
            for(i = l; i < n; i++){
                System.out.print(arr[k][i] + ",");
            }
            k++;

            // print last col
            for(i = k; i < m; i++) {
                System.out.print(arr[i][n-1] + ",");
            }
            n--;

            // print last row
            if(k < m) {
                for(i = n-1; i >= l; i--) {
                    System.out.print(arr[m-1][i] + ",");
                }
                m--;
            }

            // print first col
            if(l < n) {
                for(i = m - 1; i >= k; i--) {
                    System.out.println(arr[i][l] + ",");
                }
                l++;
            }
        }

    }
}
