package Arrays2D;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    static List<List<Integer>> pascal(int num) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.get(0).add(1);

        for(int i = 1; i < num; i++) {
            // current row
            List<Integer> row = new ArrayList<>();
            // previous row
            List<Integer> prevRow = list.get(i - 1);
            // first col
            row.add(1);

            for(int j = 1; j < i; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            // last col
            row.add(1);
            list.add(row);
        }

        return list;

    }
    public static void main(String[] args) {
        
    }
}
