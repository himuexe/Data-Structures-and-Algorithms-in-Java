package Arrays.Easy;

public class ThreePartEqualSum {
    class Solution {
        public boolean canThreePartsEqualSum(int[] arr) {
            int totalSum = 0;
            for (int num : arr) {
                totalSum += num;
            }

            if (totalSum % 3 != 0) {
                return false;
            }

            int target = totalSum / 3;
            int count = 0;
            int currentSum = 0;

            for (int num : arr) {
                currentSum += num;

                if (currentSum == target) {
                    count++;
                    currentSum = 0;
                }
            }
            return count >= 3;
        }
    }
}
