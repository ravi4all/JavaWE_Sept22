public class Patterns_5 {
    public static void main(String[] args) {
        // char c = 65;
        // System.out.println(c);

        // char c1 = 97;
        // System.out.println(c1);

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i + 1; j++) {
                int c = 97 + j;
                System.out.print((char)c);
            }
            System.out.println();
        }
    }
}
