package Bits;

public class PowerSet {
    public static void main(String[] args) {
        String str = "abc";
        double pow = Math.pow(2, str.length());
        for(int counter = 0; counter < pow; counter++) {
            for(int j = 0; j < str.length(); j++) {
                if((counter & (1 << j)) != 0) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
