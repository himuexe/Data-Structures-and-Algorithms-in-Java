package Arrays.Medium;

public class SetZeros {
    class Solution {
        public void setZeroes(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;

            boolean[] zeroRows = new boolean[m];
            boolean[] zeroCols = new boolean[n];

            // First pass: mark which rows and columns need to be zeroed
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        zeroRows[i] = true;
                        zeroCols[j] = true;
                    }
                }
            }

            // Second pass: set rows to zero
            for (int i = 0; i < m; i++) {
                if (zeroRows[i]) {
                    for (int j = 0; j < n; j++) {
                        matrix[i][j] = 0;
                    }
                }
            }

            // Third pass: set columns to zero
            for (int j = 0; j < n; j++) {
                if (zeroCols[j]) {
                    for (int i = 0; i < m; i++) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}
