public class BasicCalcP2 {
    public static void main(String[] args) {
        // Type casting
        // Wrapper Classes - Integer, Float, Double, Long
        // System.out.println(args[0] + "," + args[1] + "," + args[2]);
        int x = Integer.parseInt(args[0]);
        String operator = args[1];
        int y = Integer.parseInt(args[2]);
        int z1 = 0;
        if(operator.equals("+")) {
            z1 = x + y;
        }
        else if(operator.equals("-")) {
            z1 = x - y;
        }
        else if(operator.equals("/")) {
            z1 = x / y;
        }
        else if(operator.equals("x")) {
            z1 = x * y;
        }
        System.out.println("Result is : " + z1);
    }
}
