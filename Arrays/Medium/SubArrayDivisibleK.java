package Arrays.Medium;

public class SubArrayDivisibleK {
    class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remainderCount = new int[k];
        remainderCount[0] = 1; // Base case
        
        int count = 0;
        int prefixSum = 0;
        
        for (int num : nums) {
            prefixSum += num;
            
            // Calculate remainder, handling negative numbers
            int remainder = prefixSum % k;
            if (remainder < 0) {
                remainder += k;
            }
            
            // Add the count of previous prefix sums with same remainder
            count += remainderCount[remainder];
            
            // Update the count for this remainder
            remainderCount[remainder]++;
        }
        
        return count;
    }
}
}
