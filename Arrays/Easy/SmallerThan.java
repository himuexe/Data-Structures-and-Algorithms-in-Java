package Arrays.Easy;

import java.util.Arrays;

public class SmallerThan {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = search(sorted, nums[i]);
        }
        return result;
    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}