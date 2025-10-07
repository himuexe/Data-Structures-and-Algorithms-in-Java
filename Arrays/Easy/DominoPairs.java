package Arrays.Easy;

public class DominoPairs {
    class Solution {
        public int numEquivDominoPairs(int[][] dominoes) {
            int[] count = new int[100];

            int pairs = 0;
            for (int[] domino : dominoes) {
                int a = Math.min(domino[0], domino[1]);
                int b = Math.max(domino[0], domino[1]);
                int key = a * 10 + b;
                pairs += count[key];
                count[key]++;
            }

            return pairs;
        }
    }
}
