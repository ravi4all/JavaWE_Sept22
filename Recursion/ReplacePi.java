package Recursion;

public class ReplacePi {

    static String replace(String str, int i) {
        if(i == str.length()) {
            return "";
        }
        if(str.charAt(i) == 'p' && str.charAt(i+1) == 'i') {
            return "3.14" + replace(str, i + 2);
        }
        else {
            return str.charAt(i) + replace(str, i+1);
        }
    }

    public static void main(String[] args) {
        String str = "pi+pi-pi/piipi";
        String output = replace(str,0);
        System.out.println(output);
    }
}
