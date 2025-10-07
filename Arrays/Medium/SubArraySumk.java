package Arrays.Medium;

import java.util.HashMap;

public class SubArraySumk {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
            prefixSumCount.put(0, 1); // Base case: prefix sum 0 occurs once

            int count = 0;
            int currentSum = 0;

            for (int num : nums) {
                currentSum += num;

                // Check if (currentSum - k) exists in the map
                if (prefixSumCount.containsKey(currentSum - k)) {
                    count += prefixSumCount.get(currentSum - k);
                }

                // Update the count of current prefix sum
                prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
            }

            return count;
        }
    }
}
