package Basics.Medium;

public class IntegerReplacement {
    class Solution {
        public int integerReplacement(int n) {
            return helper(n);
        }

        private int helper(long n) {
            if (n == 1)
                return 0;
            if (n % 2 == 0) {
                return 1 + helper(n / 2);
            } else {
                return 1 + Math.min(helper(n + 1), helper(n - 1));
            }
        }
    }
}
