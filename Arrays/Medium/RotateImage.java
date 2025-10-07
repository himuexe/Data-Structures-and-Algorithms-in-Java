package Arrays.Medium;

public class RotateImage {
    class Solution {
        public void rotate(int[][] matrix) {
            transpose(matrix); // Flip across main diagonal
            reverseRows(matrix); // Flip horizontally
        }

        // Flip across main diagonal (transpose)
        public void transpose(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i; j < matrix[0].length; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        // Flip horizontally (reverse each row)
        public void reverseRows(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length / 2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][matrix.length - 1 - j];
                    matrix[i][matrix.length - 1 - j] = temp;
                }
            }
        }
    }
}
