package Searching.Hard;

public class FindMountainArray {
    interface MountainArray {
        public int get(int index);
        public int length();
    }
    
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        
        int leftSearch = binarySearch(mountainArr, target, 0, peak, true);
        if (leftSearch != -1) return leftSearch;
        
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }
    
    private int findPeak(MountainArray mountainArr) {
        int left = 0, right = mountainArr.length() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    
    private int binarySearch(MountainArray arr, int target, int left, int right, boolean ascending) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = arr.get(mid);
            
            if (midVal == target) {
                return mid;
            }
            
            if (ascending) {
                if (midVal < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (midVal > target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}