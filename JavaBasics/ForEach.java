public class ForEach {
    public static void main(String[] args) {
        String str = "Hello World...";
        // for(int i = 0; i < str.length(); i++) {
        //     System.out.println(str.charAt(i));
        // }

        // Enhanced For Loop
        char arr[] = str.toCharArray();
        for(char c : arr) {
            System.out.println(c);
        }
    }
}
