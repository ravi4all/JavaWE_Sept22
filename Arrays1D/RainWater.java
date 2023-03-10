package Arrays1D;

public class RainWater {
    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};
        int n = arr.length;
        int pMax[] = new int[n];
        pMax[0] = arr[0];
        for(int i = 1; i < n; i++) {
            pMax[i] = Math.max(pMax[i-1], arr[i]);
        }
        int sMax[] = new int[n];
        sMax[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--) {
            sMax[i] = Math.max(sMax[i+1], arr[i]);
        }
        int total = 0;
        for(int i = 0; i < n; i++) {
            int currentPillar = arr[i];
            int leftPillar = pMax[i];
            int rightPillar = sMax[i];
            int min = Math.min(leftPillar, rightPillar);
            total += min - currentPillar;
        }
        System.out.println("Total : " + total);
    }
}
