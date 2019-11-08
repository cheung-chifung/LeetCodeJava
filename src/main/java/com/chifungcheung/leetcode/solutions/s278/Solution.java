package com.chifungcheung.leetcode.solutions.s278;

/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start

public class Solution extends VersionControl {
  public int firstBadVersion(int n) {
    int l = 1;
    int r = n;
    while (l < r) {
      int m = l + (r - l) / 2;
      if (isBadVersion(m)) {
        r = m;
      } else {
        l = m + 1;
      }
    }
    return l;
  }
}
// @lc code=end
