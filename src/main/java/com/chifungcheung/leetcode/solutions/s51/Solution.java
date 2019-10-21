package com.chifungcheung.leetcode.solutions.s51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=51 lang=java
 *
 * [51] N-Queens
 */

// @lc code=start
class Solution {
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> ans = new ArrayList<>();
    if (n == 1) {
      return Arrays.asList(Arrays.asList("Q"));
    }
    if (n == 2 || n == 3) {
      return ans;
    }

    boolean[][] board = new boolean[n][n];

    this.solveCol(board, n, 0, ans);

    return ans;
  }

  private boolean solveCol(boolean[][] board, int n, int col, List<List<String>> ans) {
    for (int i = 0; i < n; i++) {
      if (this.isValid(board, n, i, col)) {
        board[i][col] = true;
        int nextCol = col + 1;
        if (nextCol == n) {
          ans.add(this.printSolution(board, n));
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

  private List<String> printSolution(boolean[][] board, int n) {
    List<String> ans = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < n; j++) {
        if (board[i][j]) {
          sb.append('Q');
        } else {
          sb.append('.');
        }
      }
      ans.add(sb.toString());
    }
    return ans;
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
