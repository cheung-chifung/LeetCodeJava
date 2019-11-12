package com.chifungcheung.leetcode.solutions.s121;

/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
  public int maxProfit(int[] prices) {
    int n = prices.length;
    int[] min = new int[n];
    int[] max = new int[n];

    int minValue = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      minValue = Integer.min(minValue, prices[i]);
      min[i] = minValue;
    }

    int maxValue = Integer.MIN_VALUE;
    for (int i = n - 1; i >= 0; i--) {
      maxValue = Integer.max(maxValue, prices[i]);
      max[i] = maxValue;
    }

    int maxProfit = 0;
    for (int i = 0; i < n; i++) {
      if (min[i] < max[i]) {
        maxProfit = Integer.max(maxProfit, max[i] - min[i]);
      }
    }
    return maxProfit;
  }
}
// @lc code=end
