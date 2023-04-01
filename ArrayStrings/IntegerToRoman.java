package ArrayStrings;

public class IntegerToRoman {
    static String []symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    static int []values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    static String int_to_roman(int num) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < values.length && num > 0; i++) {
            while(values[i] <= num) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int num = 58;
        String roman = int_to_roman(num);
        System.out.println(roman);
    }
}
