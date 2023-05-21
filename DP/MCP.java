package DP;

public class MCP {

    static int minCost(int cost[][], int m, int n) {
        if(m < 0 || n < 0) {
            return Integer.MAX_VALUE;
        }
        else if(m == 0 || n == 0) {
            return cost[m][n];
        }
        else {
            return cost[m][n] + Math.min(Math.min(minCost(cost, m-1, n),
             minCost(cost, m, n-1)), minCost(cost, m-1, n-1));
        }
    }

    public static void main(String[] args) {
        
    }
}
