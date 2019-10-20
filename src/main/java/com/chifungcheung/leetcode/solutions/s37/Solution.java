package com.chifungcheung.leetcode.solutions.s37;

/*
 * @lc app=leetcode id=37 lang=java
 *
 * [37] Sudoku Solver
 */

// @lc code=start
class Solution {
  public void solveSudoku(char[][] board) {
    if (board == null || board.length == 0) {
      return;
    }
    solve(board);
  }

  private boolean solve(char[][] board) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.') {
          for (char c = '1'; c <= '9'; c++) {
            if (this.isValid(board, i, j, c)) {
              board[i][j] = c;
              if (solve(board)) {
                return true;
              }
              board[i][j] = '.';
            }
          }
          return false;
        }
      }
    }
    return true;
  }

  private boolean isValid(char[][] board, int row, int col, char c) {
    char tmp;
    for (int i = 0; i < 9; i++) {
      tmp = board[i][col];
      if (tmp != '.' && tmp == c) {
        return false;
      }
      tmp = board[row][i];
      if (tmp != '.' && tmp == c) {
        return false;
      }
      tmp = board[3 * (row / 3) + (i / 3)][3 * (col / 3) + (i % 3)];
      if (tmp != '.' && tmp == c) {
        return false;
      }
    }
    return true;
  }
}
// @lc code=end
