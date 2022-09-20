class BasicCalc {
    public static void main(String[] args) {
        // Type casting
        // Wrapper Classes - Integer, Float, Double, Long
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z1 = x + y;
        int z2 = x - y;
        int z3 = x / y;
        int z4 = x * y;
        System.out.println("Sum is : " + z1);
        System.out.println("Sub is : " + z2);
        System.out.println("Div is : " + z3);
        System.out.println("Mul is : " + z4);
    }
}