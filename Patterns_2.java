public class Patterns_2 {
    public static void main(String[] args) {
        //      *
        //     **
        //    ***
        //   ****
        //  *****
        // ******
        for(int i = 0; i < 5; i++) {
            for(int j = 5-i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=======================");

        //      *
        //     * *
        //    * * *
        //   * * * *
        //  * * * * *
        // * * * * * *
        for(int i = 0; i < 5; i++) {
            for(int j = 5-i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k < i+1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("=======================");

        //      *
        //     ***
        //    *****
        //   *******
        //  *********
        // ***********
        for(int i = 0; i < 6; i++) {
            for(int j = 6-i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=======================");

        // *********** 
        //  *********
        //   *******
        //    *****
        //     ***
        //      *
        for(int i = 5; i >= 0; i--) {
            for(int j = 5-i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
