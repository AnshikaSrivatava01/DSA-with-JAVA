import java.util.PriorityQueue;

class Solution {
    // Helper class to store grid cell coordinates and its effective height
    class Cell implements Comparable<Cell> {
        int row;
        int col;
        int height;

        Cell(int row, int col, int height) {
            this.row = row;
            this.col = col;
            this.height = height;
        }

        @Override
        public int compareTo(Cell other) {
            return Integer.compare(this.height, other.height);
        }
    }

    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length <= 2 || heightMap[0].length <= 2) {
            return 0;
        }

        int m = heightMap.length;
        int n = heightMap[0].length;
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<Cell> minHeap = new PriorityQueue<>();

        // 1. Push all border cells into the min-heap and mark them visited
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    minHeap.offer(new Cell(i, j, heightMap[i][j]));
                    visited[i][j] = true;
                }
            }
        }

        int totalWater = 0;
        // Direction vectors for moving Up, Down, Left, Right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // 2. Process cells from the outside inward
        while (!minHeap.isEmpty()) {
            Cell current = minHeap.poll();

            for (int[] dir : directions) {
                int nextRow = current.row + dir[0];
                int nextCol = current.col + dir[1];

                // Check grid boundaries and if already visited
                if (nextRow >= 0 && nextRow < m && nextCol >= 0 && nextCol < n && !visited[nextRow][nextCol]) {
                    visited[nextRow][nextCol] = true;

                    // If the neighbor is shorter than the current boundary, it traps water
                    if (heightMap[nextRow][nextCol] < current.height) {
                        totalWater += current.height - heightMap[nextRow][nextCol];
                    }

                    // Push neighbor into heap. Its effective boundary height is max(its own height, current boundary height)
                    minHeap.offer(new Cell(nextRow, nextCol, Math.max(heightMap[nextRow][nextCol], current.height)));
                }
            }
        }

        return totalWater;
    }
}