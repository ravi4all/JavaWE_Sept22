package ArrayStrings;

public class StringsDemo {
    public static void main(String[] args) {
        String name = "John";
        // System.out.println(name.charAt(0)); // character at 0th index
        // System.out.println(name.substring(1));
        // System.out.println(name.substring(1, 3));
        // System.out.println(name.length());
        // System.out.println(name.equals("John"));

        // StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity() + "," + sb.length());
        sb.append("hello");
        System.out.println(sb.capacity() + "," + sb.length());
        sb.append(" how are you...?");
        System.out.println(sb.capacity() + "," + sb.length());
        sb.append("sfhasukhkusdhfkjsdhfkjdshfkjsdhfksdhfkjdshfjkshfkjhwgeuifhweufhuksah");
        System.out.println(sb.capacity() + "," + sb.length());

    }
}
