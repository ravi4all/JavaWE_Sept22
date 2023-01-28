package Recursion;

public class PatternP3 {

    static void printStar(int cols) {
        if(cols == 0) {
            return;
        }
        System.out.print("*");
        printStar(cols - 1);
    }

    static void printPattern(int rows) {
        if(rows == 0) {
            return;
        }
        printStar(rows);
        System.out.println();
        printPattern(rows - 1);
    }
    public static void main(String[] args) {
        printPattern(5);
    }
}
