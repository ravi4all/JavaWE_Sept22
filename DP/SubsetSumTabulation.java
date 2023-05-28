package DP;

public class SubsetSumTabulation {

    static boolean isSubset(int arr[], int n, int sum) {
        boolean subset[][] = new boolean[n+1][sum+1];
        // insert true in first col
        for(int i = 0; i <= n; i++) {
            subset[i][0] = true;
        }
        // insert false in first row
        for(int i = 1; i <= sum; i++) {
            subset[0][i] = false;
        }

        for(int i =1; i <= n; i++) {
            for(int j = 1; j <= sum; j++) {
                // sum value is less than current value in set
                if(j < arr[i-1]) {
                    subset[i][j] = subset[i-1][j];
                }
                if(j >= arr[i-1]) {
                    subset[i][j] = subset[i-1][j] || subset[i-1][j-arr[i-1]];
                }
            }
        }

        return subset[n][sum];
    }

    public static void main(String[] args) {
        
    }
}
