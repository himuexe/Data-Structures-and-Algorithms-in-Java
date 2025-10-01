class Solution {
    public static int ceiling(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (arr[mid] > target) {
            right = mid - 1;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            return mid;  // Target found
        }
    }
    
    // Target not found, left is at ceiling position
    return left < arr.length ? left : -1;
}

public static int floor(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (arr[mid] > target) {
            right = mid - 1;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            return mid;  // Target found
        }
    }
    
    // Target not found, right is at floor position
    return right >= 0 ? right : -1;
}
}