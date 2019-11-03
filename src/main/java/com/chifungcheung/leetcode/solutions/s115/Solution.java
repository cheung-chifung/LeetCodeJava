package com.chifungcheung.leetcode.solutions.s115;

/*
 * @lc app=leetcode id=115 lang=java
 *
 * [115] Distinct Subsequences
 */

// @lc code=start
class Solution {
  public int numDistinct(String s, String t) {
    int sn = s.length(), tn = t.length();
    if (sn < tn) {
      return 0;
    }
    if (sn == tn && s.equals(t)) {
      return 1;
    }

    int[][] d = new int[tn][sn];
    for (int i = 0; i < tn; i++) {
      int acc = 0;
      for (int j = i; j < sn; j++) {
        boolean sameChar = s.charAt(j) == t.charAt(i);
        if (i == 0) {
          if (sameChar) {
            acc++;
          }
          d[i][j] = acc;
        } else {
          if (sameChar) {
            acc += d[i - 1][j - 1];
          }
          d[i][j] = acc;
        }
      }
    }
    return d[tn - 1][sn - 1];
  }
}
// @lc code=end
