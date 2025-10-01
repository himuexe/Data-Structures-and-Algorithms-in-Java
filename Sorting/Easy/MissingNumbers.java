class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1) list.add(i+1);
        } 
        return list;
    }
    void sort(int[] nums){
        int i=0;
        while(i < nums.length){
            int correctPos = nums[i]-1;
            if(nums[i] != nums[correctPos]){
                swap(nums,i,correctPos);
            }
            else i++;
        }
    }
    void swap(int[] nums , int left , int right){
        int temp = nums[left];
        nums[left]= nums[right];
        nums[right]=temp;
    }
}