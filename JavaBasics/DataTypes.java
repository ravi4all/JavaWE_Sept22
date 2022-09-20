import java.math.BigDecimal;
import java.math.BigInteger;

public class DataTypes {
    public static strictfp void main(String[] args) {
        byte b = 12;    // primitive
        short s = 122;
        int i = 343232;
        float f = 34.44f;
        double d = 12.4;

        // Wrapper Class
        Byte b1 = 12;   // non-primitive
        Integer i1 = 1244;
        
        char c = 1;
        System.out.println(c);
        // ASCII - A - 65, a - 97
        int c1 = 'e';
        System.out.println(c1);

        String str = "hello world...";

        BigInteger x1 = new BigInteger("123123121231233546687698795");
        BigInteger y1 = new BigInteger("2");
        x1.add(y1);
        // x1 + y1;

        BigDecimal x2 = new BigDecimal("3423");

    }
}
