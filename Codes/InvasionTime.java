package Codes;

import java.util.LinkedList;
import java.util.Queue;

public class InvasionTime{
    public int minTimeToInvade(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int time = 0;

        // Find initial 'A' cells and enqueue them
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 'A') {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        int[] directions = {0, 1, 0, -1, 0};

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean foundEnemy = false;

            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int row = cell[0];
                int col = cell[1];

                for (int d = 0; d < 4; d++) {
                    int newRow = row + directions[d];
                    int newCol = col + directions[d + 1];

                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == 'E') {
                        grid[newRow][newCol] = 'A';
                        queue.offer(new int[]{newRow, newCol});
                        foundEnemy = true;
                    }
                }
            }

            if (foundEnemy) {
                time++;
            }
        }

        // Check for remaining 'E' cells
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 'E') {
                    return -1;
                }
            }
        }

        return time;
    }

    public static void main(String[] args) {
        
    }
}