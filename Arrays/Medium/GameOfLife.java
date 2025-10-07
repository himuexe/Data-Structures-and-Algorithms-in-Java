package Arrays.Medium;

public class GameOfLife {
    class Solution {
        public void gameOfLife(int[][] board) {
            int m = board.length;
            int n = board[0].length;

            // Create a copy of the original board
            int[][] copy = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    copy[i][j] = board[i][j];
                }
            }

            // Directions for 8 neighbors
            int[] directions = { -1, 0, 1 };

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int liveNeighbors = 0;

                    // Count live neighbors from the copy
                    for (int dx : directions) {
                        for (int dy : directions) {
                            if (dx == 0 && dy == 0)
                                continue; // Skip the cell itself

                            int ni = i + dx;
                            int nj = j + dy;

                            if (ni >= 0 && ni < m && nj >= 0 && nj < n && copy[ni][nj] == 1) {
                                liveNeighbors++;
                            }
                        }
                    }

                    // Apply rules
                    if (copy[i][j] == 1) {
                        // Rule 1 & 3: Live cell dies
                        if (liveNeighbors < 2 || liveNeighbors > 3) {
                            board[i][j] = 0;
                        }
                        // Rule 2: Live cell survives (no change needed)
                    } else {
                        // Rule 4: Dead cell becomes alive
                        if (liveNeighbors == 3) {
                            board[i][j] = 1;
                        }
                    }
                }
            }
        }
    }
}
