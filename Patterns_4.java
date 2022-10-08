public class Patterns_4 {
    public static void main(String[] args) {
        // 11111
        // 00000
        // 11111
        // 00000
        // 11111

        for(int i = 0; i < 5; i++) {
            for(int j = 0 ; j < 5; j++) {
                if(i % 2 == 0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < 5; i++) {
            for(int j = 0 ; j < 5; j++) {
                if(j % 2 == 0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}
