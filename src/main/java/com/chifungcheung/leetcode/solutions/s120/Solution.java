package com.chifungcheung.leetcode.solutions.s120;

import java.util.List;

/*
 * @lc app=leetcode id=120 lang=java
 *
 * [120] Triangle
 */

// @lc code=start
class Solution {
  public int minimumTotal(List<List<Integer>> triangle) {
    int n = triangle.size();
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return triangle.get(0).get(0);
    }

    for (int i = 1; i < n; i++) {
      List<Integer> lastLevel = triangle.get(i - 1);
      for (int j = 0; j <= i; j++) {
        int min = 0;
        int cur = triangle.get(i).get(j);
        if (j == 0) {
          min = cur + lastLevel.get(0);
        } else if (j == i) {
          min = cur + lastLevel.get(i - 1);
        } else {
          min = cur + Math.min(lastLevel.get(j - 1), lastLevel.get(j));
        }
        triangle.get(i).set(j, min);
      }
    }
    int min = Integer.MAX_VALUE;
    List<Integer> lastLevel = triangle.get(n - 1);
    for (Integer v : lastLevel) {
      min = Math.min(v, min);
    }
    return min;
  }
}
// @lc code=end
