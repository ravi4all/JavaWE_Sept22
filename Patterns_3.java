public class Patterns_3 {
    public static void main(String[] args) {
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        int row = 7;
        int col = 7;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // *****
        // *   *
        // * * *
        // *   *
        // *****
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i == 0 || j == 0 || i == row - 1 || j == col - 1 || (i == row/2 && j == col/2)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // *****
        // ** **
        // * * *
        // ** **
        // *****
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i == 0 || j == 0 || i == row - 1 || j == col - 1 || i == j || j == row - i - 1) {
                    // System.out.println(i+","+j);
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // *   *
        //  * * 
        //   * 
        //  * *
        // *   *
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i == j || j == row - i - 1) {
                    // System.out.println(i+","+j);
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //      *
        //     * *
        //    *   *
        //   *     *
        //  *********
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i == j || j == row - i - 1) {
                    // System.out.println(i+","+j);
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
