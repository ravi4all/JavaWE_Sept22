public class Patterns {
    public static void main(String[] args) {
        // *****
        // *****
        // *****
        // *****
        // *****
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(i + "" + j + ", ");
            }
            System.out.println();
        }

        // *
        // **
        // ***
        // ****
        // *****
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // *****
        // ****
        // ***
        // **
        // *
        for(int i = 0; i < 5; i++) {
            for(int j = 5-i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
