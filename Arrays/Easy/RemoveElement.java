package Arrays.Easy;

public class RemoveElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int writeIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[writeIndex++] = nums[i];
                }
            }
            return writeIndex;
        }
    }
}
