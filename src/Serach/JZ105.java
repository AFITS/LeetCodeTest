package Serach;

/**
 * 最大岛屿面积
 * 1为岛屿，0为海洋，求最大岛屿面积。（为二维矩阵表示）
 */
public class JZ105 {

    class Solution {
        int[][] direction = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

        public int maxAreaOfIsland(int[][] grid) {
            if (grid.length == 0 || grid[0].length == 0) return 0;
            int maxArea = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {  // 判断筛选条件不要忘
                        maxArea = Math.max(dfs(grid, i, j), maxArea);
                    }
                }
            }
            return maxArea;
        }

        public int dfs(int[][] grid, int r, int c) {
            if (grid[r][c] == 0) return 0;
            grid[r][c] = 0;
            int x, y, area = 1;
            for (int i = 0; i < 4; i++) {
                x = r + direction[i][0];
                y = c + direction[i][1];
                if (0 <= x && x < grid.length && 0 <= y && y < grid[0].length) {
                    area += dfs(grid, x, y);
                }
            }
            int i =12;
            return area;
        }
    }


}
