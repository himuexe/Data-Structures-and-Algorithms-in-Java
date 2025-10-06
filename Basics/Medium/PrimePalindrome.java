package Basics.Medium;

public class PrimePalindrome {
    class Solution {
        public int primePalindrome(int n) {
            while (true) {
                if (isPalindrome(n) && isPrime(n)) {
                    return n;
                }
                n++;
                // Skip even-length palindromes > 11 (except 11 itself)
                if (n > 11 && String.valueOf(n).length() % 2 == 0) {
                    n = (int) Math.pow(10, String.valueOf(n).length());
                }
            }
        }

        private boolean isPalindrome(int num) {
            String s = String.valueOf(num);
            int left = 0, right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        private boolean isPrime(int num) {
            if (num < 2)
                return false;
            if (num == 2)
                return true;
            if (num % 2 == 0)
                return false;

            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
