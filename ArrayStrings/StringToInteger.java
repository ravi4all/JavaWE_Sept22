package ArrayStrings;

public class StringToInteger {

    static int atoi(String str) {
        int n = str.length();
        int result = 0;
        int index = 0;
        int sign = 1;
        while(index < n && str.charAt(index) == ' ') {
            index++;
        }
        if(str.charAt(index) == '-') {
            sign = -1;
        }
        else if(str.charAt(index) == '+') {
            sign = 1;
        }

        while(index < n) {
            char currentChar = str.charAt(index);
            if(!Character.isDigit(currentChar)) {
                continue;
            }
            int digit = currentChar - '0';

            if(result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
        }
        return result * sign;

        
    }
    public static void main(String[] args) {
        
    }
}
