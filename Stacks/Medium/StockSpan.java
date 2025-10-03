package Stacks.Medium;

import java.util.*;

public class StockSpan {

    public static void stockSpan(int[] stocks, int[] span) {
        Stack<Integer> st = new Stack<>();
        span[0] = 1; // First day always has span 1
        st.push(0); // Push first day's index

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];

            // Pop days with price <= current price
            while (!st.isEmpty() && currPrice > stocks[st.peek()]) {
                st.pop();
            }

            // Calculate span
            if (st.isEmpty()) {
                span[i] = i + 1; // All previous days
            } else {
                int prevHigh = st.peek();
                span[i] = i - prevHigh; // Days since previous higher
            }

            st.push(i); // Push current day's index
        }
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
