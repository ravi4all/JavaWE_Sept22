package Recursion;

import java.util.ArrayList;

public class MazePath {
    static ArrayList<String> path(int currentRow, int currentCol, int endRow, int endCol) {

        // Positive Base Case
        if(currentRow == endRow && currentCol == endCol) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        
        // Negative Base Case
        if(currentCol > endCol || currentRow > endRow) {
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }

        ArrayList<String> result = new ArrayList<>();

        ArrayList<String> horizontalResult = path(currentRow, currentCol + 1, endRow, endCol);
        for(String s : horizontalResult) {
            result.add("H" + s);
        }

        ArrayList<String> verticalResut = path(currentRow + 1, currentCol, endRow, endCol);
        for(String s : verticalResut) {
            result.add("V" + s);
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(path(1, 1, 3, 3));
    }
}
