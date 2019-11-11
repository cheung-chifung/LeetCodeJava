package com.chifungcheung.leetcode.solutions.s274;

import java.util.Arrays;

/*
 * @lc app=leetcode id=274 lang=java
 *
 * [274] H-Index
 */

// @lc code=start
class Solution {
  public int hIndex(int[] citations) {
    Arrays.sort(citations);
    int hMax = 0;
    for (int i = citations.length - 1; i >= 0; i--) {
      hMax = Integer.max(hMax, Integer.min(citations[i], citations.length - i));
    }
    return hMax;
  }
}
// @lc code=end
