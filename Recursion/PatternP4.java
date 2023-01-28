package Recursion;

public class PatternP4 {

    static void printSpace(int cols) {
        if(cols == 0) {
            return;
        }
        System.out.print(" ");
        printSpace(cols - 1);
    }

    static void printStar(int cols) {
        if(cols == 0) {
            return;
        }
        System.out.print("*");
        printStar(cols - 1);
    }

    static void printPattern(int rows, int cols) {
        if(rows == 0) {
            return;
        }
        printSpace(rows - 1);
        printStar(cols);
        System.out.println();
        printPattern(rows - 1, cols + 2);
    }

    public static void main(String[] args) {
        printPattern(5, 1);
    }
}
