package Arrays.Medium;

public class DiagonalTraverse {
    class Solution {
        public int[] findDiagonalOrder(int[][] mat) {
            if (mat.length == 0)
                return new int[0];

            int m = mat.length;
            int n = mat[0].length;
            int[] result = new int[m * n];
            int idx = 0;

            int row = 0, col = 0;
            boolean up = true; // Direction: true = up-right, false = down-left

            while (idx < m * n) {
                result[idx++] = mat[row][col];

                if (up) {
                    // Moving up-right
                    if (col == n - 1) {
                        // Hit right boundary, move down
                        row++;
                        up = false;
                    } else if (row == 0) {
                        // Hit top boundary, move right
                        col++;
                        up = false;
                    } else {
                        // Normal up-right movement
                        row--;
                        col++;
                    }
                } else {
                    // Moving down-left
                    if (row == m - 1) {
                        // Hit bottom boundary, move right
                        col++;
                        up = true;
                    } else if (col == 0) {
                        // Hit left boundary, move down
                        row++;
                        up = true;
                    } else {
                        // Normal down-left movement
                        row++;
                        col--;
                    }
                }
            }

            return result;
        }
    }
}
