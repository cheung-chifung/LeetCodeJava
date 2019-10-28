package com.chifungcheung.leetcode.solutions.s97;

/*
 * @lc app=leetcode id=97 lang=java
 *
 * [97] Interleaving String
 */

// @lc code=start
class Solution {
  public boolean isInterleave(String s1, String s2, String s3) {
    int n1 = s1.length();
    int n2 = s2.length();
    if (n1 == 0 && n2 == 0) {
      return s3.isEmpty();
    }
    if (n1 == 0) {
      return s3.equals(s2);
    }
    if (n2 == 0) {
      return s3.equals(s1);
    }
    if (n1 + n2 != s3.length()) {
      return false;
    }
    boolean[][] d = new boolean[n1 + 1][n2 + 1];
    d[0][0] = true;
    for (int i1 = 1; i1 < n1 + 1; i1++) {
      d[i1][0] = d[i1 - 1][0] && (s1.charAt(i1 - 1) == s3.charAt(i1 - 1));
    }
    for (int i2 = 1; i2 < n2 + 1; i2++) {
      d[0][i2] = d[0][i2 - 1] && (s2.charAt(i2 - 1) == s3.charAt(i2 - 1));
    }

    for (int i1 = 1; i1 < n1 + 1; i1++) {
      for (int i2 = 1; i2 < n2 + 1; i2++) {
        char lc = s3.charAt(i1 + i2 - 1);
        d[i1][i2] = (s1.charAt(i1 - 1) == lc && d[i1 - 1][i2]) || (s2.charAt(i2 - 1) == lc && d[i1][i2 - 1]);
      }
    }
    return d[n1][n2];
  }
}
// @lc code=end
