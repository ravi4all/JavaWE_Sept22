package Stack;

import java.util.Stack;

public class StockSpan {

    static int[] span(int price[]) {
        int n = price.length;
        int result[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        result[0] = 1;
        for(int i = 1; i < n; i++) {
            while(!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            result[i] = (st.isEmpty() ? (i+1) : (i - st.peek()));
            st.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int price[] = {100, 80, 60, 70, 60, 75, 85};
        span(price);
    }
}
