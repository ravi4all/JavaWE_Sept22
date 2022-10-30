public class StringDemo {

    public static void main(String[] args) {
        
        //String text = "Hello World.";
        // internally string is a character array
        //['H','e','l','l','o',' ','W','o','r','l','d','.']
        
        String name = "Ram";
        String name_2 = "Ram";
        String name_3 = name;
        // it will either create one object or zero, depends if object already exists
        
        System.out.println(name.equals(name_2)); // true
        // .equals() compares the value of two objects
        System.out.println(name == name_2); // true
        // == compares the reference of two objects
        
        String name_4 = new String("Ram");
        // it will always create 2 objects, but if object with same value
        // already exists than it creates only copy of object
        System.out.println(name.equals(name_4)); // true
        System.out.println(name == name_4); // false
        
        String text = "Hello World..";
        System.out.println(text.charAt(0));
        // character present at 0th index
        
        // slicing of a string
        System.out.println(text.substring(3));
        // will print characters from 3rd index to last index
        
        System.out.println(text.substring(2, 6));
        // will print from 2nd index(inclusive)  to 6th index (exclusive)
        
        String wordArray[] = text.split(" ");
        // ["Hello", "World.."]
        
        char charArray[] = text.toCharArray();
        // ['H','e','l','l','o',' ','W','o','r','l','d','.','.']
        
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

    }

}
