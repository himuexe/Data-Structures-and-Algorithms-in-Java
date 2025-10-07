package Arrays.Medium;

public class ClosestPerson {
    class Solution {
        public int maxDistToClosest(int[] seats) {
            int n = seats.length;
            int maxDistance = 0;
            int left = -1; // Position of last occupied seat

            for (int i = 0; i < n; i++) {
                if (seats[i] == 1) {
                    if (left == -1) {
                        // First occupied seat - handle left section
                        maxDistance = i;
                    } else {
                        // Middle section - sit between two occupied seats
                        maxDistance = Math.max(maxDistance, (i - left) / 2);
                    }
                    left = i;
                }
            }

            // Handle right section
            maxDistance = Math.max(maxDistance, n - 1 - left);

            return maxDistance;
        }
    }
}
