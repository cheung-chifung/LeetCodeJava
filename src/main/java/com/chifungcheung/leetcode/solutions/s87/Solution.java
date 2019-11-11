package com.chifungcheung.leetcode.solutions.s87;

/*
 * @lc app=leetcode id=87 lang=java
 *
 * [87] Scramble String
 */

// @lc code=start
class Solution {
  public boolean isScramble(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    int n = s1.length();
    boolean[][][] d = new boolean[n][n][n];
    for (int k = 0; k < n; k++) {
      for (int i = 0; i + k < n; i++) {
        for (int j = 0; j + k < n; j++) {
          if (k == 0) {
            d[0][i][j] = s1.charAt(i) == s2.charAt(j);
          } else {
            for (int q = 0; q < k && !d[k][i][j]; q++) {
              d[k][i][j] = (d[q][i][j] && d[k - q - 1][i + q + 1][j + q + 1])
                  || (d[q][i][j + k - q] && d[k - q - 1][i + q + 1][j]);
            }
          }
        }
      }
    }
    return d[n - 1][0][0];
  }
}
// @lc code=end
