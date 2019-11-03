package com.chifungcheung.leetcode.solutions.s165;

/*
 * @lc app=leetcode id=165 lang=java
 *
 * [165] Compare Version Numbers
 */

// @lc code=start
class Solution {
  public int compareVersion(String version1, String version2) {
    String[] v1 = version1.split("\\.");
    String[] v2 = version2.split("\\.");
    int n = Math.max(v1.length, v2.length);
    for (int i = 0; i < n; i++) {
      int d1 = i < v1.length ? Integer.valueOf(v1[i]) : 0;
      int d2 = i < v2.length ? Integer.valueOf(v2[i]) : 0;
      if (d1 > d2) {
        return 1;
      } else if (d1 < d2) {
        return -1;
      }
    }
    return 0;
  }
}
// @lc code=end
