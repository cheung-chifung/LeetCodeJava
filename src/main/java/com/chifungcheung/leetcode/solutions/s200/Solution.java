package com.chifungcheung.leetcode.solutions.s200;

/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
  public int numIslands(char[][] grid) {
    int rows = grid.length;
    if (rows == 0) {
      return 0;
    }
    int cols = grid[0].length;
    if (cols == 0) {
      return 0;
    }
    int count = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (grid[i][j] == '1') {
          dfsMark(grid, rows, cols, i, j);
          count++;
        }
      }
    }
    return count;
  }

  private void dfsMark(char[][] grid, int rows, int cols, int i, int j) {
    if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == '0') {
      return;
    }
    grid[i][j] = '0';
    dfsMark(grid, rows, cols, i - 1, j);
    dfsMark(grid, rows, cols, i + 1, j);
    dfsMark(grid, rows, cols, i, j - 1);
    dfsMark(grid, rows, cols, i, j + 1);
  }
}
// @lc code=end
