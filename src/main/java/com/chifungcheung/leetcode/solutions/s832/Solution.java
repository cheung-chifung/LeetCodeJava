package com.chifungcheung.leetcode.solutions.s832;

/*
 * @lc app=leetcode id=832 lang=java
 *
 * [832] Flipping an Image
 */

// @lc code=start
class Solution {
  public int[][] flipAndInvertImage(int[][] A) {
    int n = A.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n / 2; j++) {
        int temp = A[i][n - j - 1];
        A[i][n - j - 1] = A[i][j];
        A[i][j] = temp;
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        A[i][j] = 1 - A[i][j];
      }
    }
    return A;
  }
}
// @lc code=end
