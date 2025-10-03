package Stacks.Medium;

import java.util.Stack;

public class NextGreaterElement2 {
    public class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < n; i++) {
                result[i] = -1;
            }

            for (int i = 0; i < 2 * n; i++) {
                int idx = i % n;

                while (!stack.isEmpty() && nums[stack.peek()] < nums[idx]) {
                    int popped = stack.pop();
                    result[popped] = nums[idx];
                }

                if (i < n) {
                    stack.push(idx);
                }
            }

            return result;
        }
    }
}
