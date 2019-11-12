package com.chifungcheung.leetcode.solutions.s122;

/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
  public int maxProfit(int[] prices) {
    int n = prices.length;
    if (n == 0) {
      return 0;
    }
    int[] d = new int[n]; // max profit
    d[0] = 0;
    for (int i = 1; i < n; i++) {
      d[i] = d[i - 1] + Integer.max(prices[i] - prices[i - 1], 0);
    }
    return d[n - 1];
  }
}
// @lc code=end
