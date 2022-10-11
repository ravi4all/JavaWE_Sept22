public class ForEach {
    public static void main(String[] args) {
        // String str = "Hello World...";
        // for(int i = 0; i < str.length(); i++) {
        //     System.out.println(str.charAt(i));
        // }

        // Enhanced For Loop
        // char arr[] = str.toCharArray();
        // for(char c : arr) {
        //     System.out.println(c);
        // }

        String []names = {"Ram", "Shyam", "Gopal", "Sumit", "Namit"};
        // System.out.println(names[0]);
        // System.out.println(names[1]);
        // for(int i = 0; i < names.length; i++) {
        //     System.out.println(names[i]);
        // }

        for(String str : names) {
            System.out.println(str);
        }

        int age[] = {30,45,17,19,15};
        for(int i : age) {
            if(i > 18) {
                System.out.println("Eligible...");
            }
        }

    }
}
