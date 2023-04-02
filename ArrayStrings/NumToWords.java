package ArrayStrings;

class NumToWords {
    public String ones(int num) {
        switch (num) {
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
        }
        return "";
    }

    public String twoLessThan20(int num){
        switch (num) {
            case 10: return "Ten";
            case 11: return "Eleven";
            case 12: return "Twelve";
            case 13: return "Thirteen";
            case 14: return "Fourteen";
            case 15: return "Fifteen";
            case 16: return "Sixteen";
            case 17: return "Seventeen";
            case 18: return "Eighteen";
            case 19: return "Nineteen";
        }
        return "";
    }

    public String tens(int num){
        switch (num) {
            case 2: return "Twenty";
            case 3: return "Thirty";
            case 4: return "Forty";
            case 5: return "Fifty";
            case 6: return "Sixty";
            case 7: return "Seventy";
            case 8: return "Eighty";
            case 9: return "Ninety";
        }
        return "";
    }

    public String two(int num) {
        if(num == 0) {
            return "";
        }
        else if(num < 10) {
            return ones(num);
        }
        else if(num < 20) {
            return twoLessThan20(num);
        }
        else {
            int t = num / 10;
            int rem = num - t * 10;
            if(rem != 0) {
                return tens(t) + " " + ones(rem);
            }
            else {
                return tens(t);
            }            
        }
    }

    public String threeDigits(int num) {
        int hundred = num / 100;
        int rem = num - hundred * 100;
        String result = "";
        if(hundred * rem != 0) {
            result = ones(hundred) + " Hundred " + two(rem);
        }
        else if(hundred == 0 && rem != 0) {
            result = two(rem);
        }
        else if(hundred != 0 && rem == 0) {
            result = ones(hundred) + " Hundred";
        }
        return result;
    }
    public String numberToWords(int num) {
        if(num == 0) {
            return "Zero";
        }
        int billion = num / 1000000000;
        int million = (num - billion * 1000000000) / 1000000;
        int thousand = (num - billion * 1000000000 - million * 1000000) / 1000;
        int rem = (num - billion * 1000000000 - million * 1000000 - thousand * 1000);
        String result = "";
        if(billion != 0) {
            result = threeDigits(billion) + " Billion";
        }
        if(million != 0) {
            if(!result.isEmpty()) {
                result += " ";
            }
            result += threeDigits(million) + " Million";
        }
        if(thousand != 0) {
            if(!result.isEmpty()) {
                result += " ";
            }
            result += threeDigits(thousand) + " Thousand";
        }
        if(rem != 0) {
            if(!result.isEmpty()) {
                result += " ";
            }
            result += threeDigits(rem);
        }

        return result;
    }

    public static void main(String[] args) {
        int num = 122432;
    }
}