package Arrays1D;

public class GasStation {
    public static void main(String[] args) {
        int gas[] = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};
        int remainingGas = 0;
        int loss = 0;
        int startingPoint = 0;
        int n = gas.length;
        for(int i = 0; i < n; i++) {
            remainingGas += gas[i] - cost[i];
            if(remainingGas < 0) {
                startingPoint = i + 1;
                loss += remainingGas;
                remainingGas = 0;
            }
        }
        int res = remainingGas + loss >= 0 ? startingPoint : -1;
        System.out.println(res);
    }
}
