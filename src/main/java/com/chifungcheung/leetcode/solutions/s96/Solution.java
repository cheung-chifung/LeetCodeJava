package com.chifungcheung.leetcode.solutions.s96;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=96 lang=java
 *
 * [96] Unique Binary Search Trees
 */

// @lc code=start
class Solution {
  public int numTrees(int n) {
    Map<Integer, Integer> m = new HashMap<>();
    return numTreesWithCache(n, m);
  }

  private int numTreesWithCache(int n, Map<Integer, Integer> m) {
    if (n == 1 || n == 0) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }
    if (m.containsKey(n)) {
      return m.get(n);
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
      ans += numTreesWithCache(i, m) * numTreesWithCache(n - i - 1, m);
    }
    return ans;
  }
}
// @lc code=end
