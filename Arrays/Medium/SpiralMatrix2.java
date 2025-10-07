package Arrays.Medium;

public class SpiralMatrix2 {
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            int num = 1;

            int top = 0, bottom = n - 1;
            int left = 0, right = n - 1;

            while (top <= bottom && left <= right) {
                // Top row: left to right
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = num++;
                }
                top++;

                // Right column: top to bottom
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = num++;
                }
                right--;

                // Bottom row: right to left
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        matrix[bottom][i] = num++;
                    }
                    bottom--;
                }

                // Left column: bottom to top
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        matrix[i][left] = num++;
                    }
                    left++;
                }
            }

            return matrix;
        }
    }
}
