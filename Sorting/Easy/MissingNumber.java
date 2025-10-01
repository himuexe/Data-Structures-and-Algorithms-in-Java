class Solution {
    public int missingNumber(int[] nums) {
       sort(nums);
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=i) return i;
       }
       return nums.length;
    }
    public void sort(int[] nums){
        int i=0;
        while(i<nums.length){
            int cp = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[cp]){
                int temp = nums[i];
                nums[i]=nums[cp];
                nums[cp]=temp;
            }
            else{
                i++;
            }
        }
    }
}