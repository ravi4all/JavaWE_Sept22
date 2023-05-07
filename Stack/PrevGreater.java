package Stack;

import java.util.Stack;

public class PrevGreater {
    static int[] prev(int arr[]) {
        int n = arr.length;
        int result[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        result[0] = -1;
        for(int i = 1; i < n; i++) {
            while(!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            result[i] = (st.isEmpty() ? (-1) : (st.peek()));
            st.push(arr[i]);
        }
        return result;
    }

    static int optimized(int arr[]) {
        /*
         * - traverse from left to right
         * - if stack value is greater then current bar value
         *      - push current bar index in stack
         * - if any higher current bar, then pop all the bars from stack which are smaller than the current bar
         * calculate area every time you pop
         *      if(stack is empty) => area = height of min_bar * right
         *      else -  width = (right - left + 1)
         *              area = width * hight of min_bar
         */
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {10, 4, 2, 20, 40, 12, 30};
        prev(arr);
    }
}
