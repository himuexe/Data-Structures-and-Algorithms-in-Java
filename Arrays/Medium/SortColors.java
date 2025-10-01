class Solution {
    public void sortColors(int[] nums) {
        int left=0,mid=0,right=nums.length-1;
        while(mid <= right){
            if(nums[mid]==0){
                swap(mid,left,nums);
                left++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(right,mid,nums);
                right--;
            }
        }
    }
    void swap(int left , int right , int[] nums){
        int temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}