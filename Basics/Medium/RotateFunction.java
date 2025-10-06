package Basics.Medium;

public class RotateFunction {
    class Solution {
        public int maxRotateFunction(int[] nums) {
            int n = nums.length;
            int sum = 0;
            int F = 0;

            // Calculate sum of all elements and F(0)
            for (int i = 0; i < n; i++) {
                sum += nums[i];
                F += i * nums[i];
            }

            int maxF = F;

            // Calculate F(k) using the recurrence relation
            for (int k = 1; k < n; k++) {
                F = F + sum - n * nums[n - k];
                maxF = Math.max(maxF, F);
            }

            return maxF;
        }
    }
}
