package com.chifungcheung.leetcode.solutions.s583;

/*
 * @lc app=leetcode id=583 lang=java
 *
 * [583] Delete Operation for Two Strings
 */

// @lc code=start
class Solution {
  public int minDistance(String word1, String word2) {
    return word1.length() + word2.length() - 2 * largestCommonString(word1, word2);
  }

  private int largestCommonString(String word1, String word2) {
    int n1 = word1.length();
    int n2 = word2.length();
    int[][] d = new int[n1 + 1][n2 + 1];

    for (int i = 1; i <= n1; i++) {
      for (int j = 1; j <= n2; j++) {
        int m1 = (word1.charAt(i - 1) == word2.charAt(j - 1) ? 1 : 0) + d[i - 1][j - 1];
        int m2 = Integer.max(d[i][j - 1], d[i - 1][j]);
        d[i][j] = Integer.max(m1, m2);
      }
    }

    return d[n1][n2];
  }
}
// @lc code=end
