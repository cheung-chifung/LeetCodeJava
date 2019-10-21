package com.chifungcheung.leetcode.solutions.s52;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * @lc app=leetcode id=52 lang=java
 *
 * [52] N-Queens
 */

// @lc code=start
class Solution {
  public int totalNQueens(int n) {
    if (n == 1) {
      return 1;
    }
    if (n == 2 || n == 3) {
      return 0;
    }

    boolean[][] board = new boolean[n][n];
    AtomicInteger ans = new AtomicInteger();

    this.solveCol(board, n, 0, ans);

    return ans.get();
  }

  private boolean solveCol(boolean[][] board, int n, int col, AtomicInteger ans) {
    for (int i = 0; i < n; i++) {
      if (this.isValid(board, n, i, col)) {
        board[i][col] = true;
        int nextCol = col + 1;
        if (nextCol == n) {
          ans.incrementAndGet();
          board[i][col] = false;
        } else if (nextCol < n) {
          if (this.solveCol(board, n, nextCol, ans)) {
            return true;
          } else {
            board[i][col] = false;
          }
        }
      }
    }
    return false;
  }

  private boolean isValid(boolean[][] board, int n, int row, int col) {
    for (int i = 0; i < n; i++) {
      if (board[i][col] && i != row)
        return false;
      if (board[row][i] && i != col)
        return false;
    }
    for (int i = 1; i < n; i++) {
      if (row + i < n && col + i < n && board[row + i][col + i]) {
        return false;
      }
      if (row - i >= 0 && col + i < n && board[row - i][col + i]) {
        return false;
      }
      if (row + i < n && col - i >= 0 && board[row + i][col - i]) {
        return false;
      }
      if (row - i >= 0 && col - i >= 0 && board[row - i][col - i]) {
        return false;
      }
    }
    return true;
  }
}
// @lc code=end
