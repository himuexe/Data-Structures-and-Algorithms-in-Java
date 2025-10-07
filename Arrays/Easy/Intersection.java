package Arrays.Easy;

import java.util.*;

public class Intersection {

    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> resultSet = new HashSet<>();

            // Add all elements from first array to set
            for (int num : nums1) {
                set1.add(num);
            }

            // Check which elements from second array exist in first set
            for (int num : nums2) {
                if (set1.contains(num)) {
                    resultSet.add(num);
                }
            }

            // Convert set to array
            int[] result = new int[resultSet.size()];
            int i = 0;
            for (int num : resultSet) {
                result[i++] = num;
            }

            return result;
        }
    }
}
