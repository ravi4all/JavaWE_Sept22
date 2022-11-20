import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        
        //int n1 = 12;
        int n1[] = {3,2,1,5,13};
        String names[] = {"John", "Jack", "Sam"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        int n2[] = new int[5];
        
        // Dynamic Array
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(5);
        arr.add(12);
        
        arr.get(0);
        arr.get(1);
        
        for(int i : arr) {
            System.out.println(i);
        }

    }

}
