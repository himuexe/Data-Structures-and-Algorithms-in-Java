public class SetMisMatch {
    public int[] findErrorNums(int[] nums) {
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[] { nums[i], i + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    public void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctPos = arr[i] - 1;
            if (arr[i] != arr[correctPos]) {
                int temp = arr[i];
                arr[i] = arr[correctPos];
                arr[correctPos] = temp;
            } else {
                i++;
            }
        }
    }
}