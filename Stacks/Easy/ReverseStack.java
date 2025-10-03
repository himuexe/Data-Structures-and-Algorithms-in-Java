package Stacks.Easy;

import java.util.Stack;

public class ReverseStack {
    class Solution {
        public static void reverseStack(Stack<Integer> st) {
            if (st.isEmpty()) {
                return;
            }
            int top = st.pop();
            reverseStack(st);
            pushAtBottom(st, top);
        }

        public static void pushAtBottom(Stack<Integer> st, int data) {
            if (st.isEmpty()) {
                st.push(data);
                return;
            }
            int top = st.pop();
            pushAtBottom(st, data);
            st.push(top);
        }
    }
}
