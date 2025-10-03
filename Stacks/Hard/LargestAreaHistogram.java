package Stacks.Hard;

import java.util.Stack;

public class LargestAreaHistogram {
    class Solution {
        public int largestRectangleArea(int[] heights) {
            if (heights.length == 1) {
                return heights[0];
            }
            int maxArea = 0;
            int[] nsr = new int[heights.length];
            int[] nsl = new int[heights.length];
            Stack<Integer> st = new Stack<>();
            for (int i = heights.length - 1; i >= 0; i--) {
                while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    nsr[i] = heights.length;
                } else {
                    nsr[i] = st.peek();
                }
                st.push(i);
            }
            st = new Stack<>();
            for (int i = 0; i < heights.length; i++) {
                while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    nsl[i] = -1;
                } else {
                    nsl[i] = st.peek();
                }
                st.push(i);
            }
            for (int i = 0; i < heights.length; i++) {
                int height = heights[i];
                int width = nsr[i] - nsl[i] - 1;
                int currArea = height * width;
                maxArea = Math.max(currArea, maxArea);
            }
            return maxArea;
        }
    }
}
