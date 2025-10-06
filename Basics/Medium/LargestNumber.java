package Basics.Medium;

import java.util.Arrays;

public class LargestNumber {
    class Solution {
        public String largestNumber(int[] nums) {
            // Convert integers to strings
            String[] strNums = new String[nums.length];
            for (int i = 0; i < nums.length; i++) {
                strNums[i] = String.valueOf(nums[i]);
            }

            // Custom comparator: compare a+b vs b+a
            Arrays.sort(strNums, (a, b) -> {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            });

            // Handle case where largest number is "0"
            if (strNums[0].equals("0")) {
                return "0";
            }

            // Build result string
            StringBuilder result = new StringBuilder();
            for (String num : strNums) {
                result.append(num);
            }

            return result.toString();
        }
    }
}
