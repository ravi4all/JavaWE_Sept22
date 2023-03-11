package Arrays1D;

import java.util.ArrayList;

public class TargetArray {
    public static void main(String[] args) {
        ArrayList<Integer> target = new ArrayList<>();
        int nums[] = {0,1,2,3,4}, index[] = {0,1,2,2,1};
        for(int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        System.out.println(target);
    }
}
