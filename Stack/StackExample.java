package Stack;

import java.util.LinkedList;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // LinkedList<Integer> list = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st);
        System.out.println(st.peek());  // top element of stack
        System.out.println(st.pop());   // remove top element
        System.out.println(st);

    }
}
