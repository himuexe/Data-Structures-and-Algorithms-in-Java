class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int left=0,right=height.length-1;
        while(left<right){
            int h = Math.min(height[left],height[right]);
            int w = right-left;
            area = Math.max(area,h*w);
            if(height[left]<height[right])left++;
            else right--;
        }
        return area;
    }
}