package Stacks.Easy;

import java.util.*;

public class NextGreater {
    public static int[] next(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> st = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = nums[st.peek()];
            }

            st.push(i);
        }
        return result;
    }
}
