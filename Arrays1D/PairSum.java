package Arrays1D;

import java.util.HashMap;

public class PairSum {
    // public int[] twoSum(int[] arr, int target) {
    //     int n = arr.length;
    //     int res[] = new int[2];
    //     for(int i = 0; i < n; i++) {
    //         for(int j = i+1; j < n; j++) {
    //             if(arr[i] + arr[j] == target) {
    //                 res[0] = i;
    //                 res[1] = j;
    //                 return res;
    //             }
    //         }
    //     }
    //     return res;
    // }

    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int res[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(map.get(arr[i]) == null) {
                map.put(target - arr[i], i);
            }
            else {
                res[0] = map.get(arr[i]);
                res[1] = i;
            }
        }
        return res;
    }

    // public int[] twoSum(int[] arr, int target) {
    //     Arrays.sort(arr);
    //     int n = arr.length;
    //     int res[] = new int[2];
    //     int i = 0;
    //     int j = n - 1;
    //     while(i < j) {
    //         if(arr[i] + arr[j] == target) {
    //             res[0] = i;
    //             res[1] = j;
    //             return res;
    //         }
    //         if(arr[i] + arr[j] < target) {
    //             i++;
    //         }
    //         if(arr[i] + arr[j] > target) {
    //             i++;
    //         }
    //     }
    //     return res;
    // }

    public static void main(String[] args) {
        
    }
}
