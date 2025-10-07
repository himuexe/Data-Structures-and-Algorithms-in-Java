package Arrays.Easy;

public class SortParity2 {
    class Solution {
        public int[] sortArrayByParityII(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];

            // Place even numbers at even indices
            int evenIndex = 0;
            for (int num : nums) {
                if (num % 2 == 0) {
                    result[evenIndex] = num;
                    evenIndex += 2;
                }
            }

            // Place odd numbers at odd indices
            int oddIndex = 1;
            for (int num : nums) {
                if (num % 2 == 1) {
                    result[oddIndex] = num;
                    oddIndex += 2;
                }
            }

            return result;
        }
    }
}
