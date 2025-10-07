package Arrays.Easy;

import java.util.*;

public class RelativeSort {
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            // Count frequency using HashMap
            Map<Integer, Integer> countMap = new HashMap<>();
            for (int num : arr1) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            int[] result = new int[arr1.length];
            int index = 0;

            // Place elements in order of arr2
            for (int num : arr2) {
                int frequency = countMap.get(num);
                for (int i = 0; i < frequency; i++) {
                    result[index++] = num;
                }
                countMap.remove(num); // Remove to track remaining elements
            }

            // Get remaining elements and sort them
            List<Integer> remaining = new ArrayList<>(countMap.keySet());
            Collections.sort(remaining);

            // Add remaining elements in sorted order
            for (int num : remaining) {
                int frequency = countMap.get(num);
                for (int i = 0; i < frequency; i++) {
                    result[index++] = num;
                }
            }

            return result;
        }
    }
}
