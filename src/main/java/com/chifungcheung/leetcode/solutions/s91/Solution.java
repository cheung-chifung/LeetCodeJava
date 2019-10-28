package com.chifungcheung.leetcode.solutions.s91;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=91 lang=java
 *
 * [91] Decode Ways
 */

// @lc code=start
class Solution {
  public int numDecodings(String s) {
    Map<Integer, Integer> d = new HashMap<>();
    return dfs(s, 0, d);
  }

  private int dfs(String s, int start, Map<Integer, Integer> d) {
    if (d.containsKey(start)) {
      return d.get(start);
    }
    if (start == s.length()) {
      return 1;
    }
    int ans = 0;
    if (start < s.length()) {
      int a = (s.charAt(start) - '0');
      if (a > 0 && a <= 26) {
        ans += dfs(s, start + 1, d);
      }
    }
    if (start < s.length() - 1) {
      int a = (s.charAt(start) - '0');
      int b = (s.charAt(start + 1) - '0');
      int num = a * 10 + b;
      if (a != 0 && num > 0 && num <= 26) {
        ans += dfs(s, start + 2, d);
      }
    }
    d.put(start, ans);
    return ans;
  }
}
// @lc code=end
