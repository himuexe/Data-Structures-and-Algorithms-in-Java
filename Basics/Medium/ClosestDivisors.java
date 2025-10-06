package Basics.Medium;

public class ClosestDivisors {
    class Solution {
        public int[] closestDivisors(int num) {
            int[] div1 = findClosestDivisors(num + 1);
            int[] div2 = findClosestDivisors(num + 2);

            int diff1 = Math.abs(div1[0] - div1[1]);
            int diff2 = Math.abs(div2[0] - div2[1]);

            return diff1 < diff2 ? div1 : div2;
        }

        private int[] findClosestDivisors(int n) {
            int sqrt = (int) Math.sqrt(n);
            for (int i = sqrt; i >= 1; i--) {
                if (n % i == 0) {
                    return new int[] { i, n / i };
                }
            }
            return new int[] { 1, n };
        }
    }
}
