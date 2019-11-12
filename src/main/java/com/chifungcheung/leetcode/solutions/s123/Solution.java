package com.chifungcheung.leetcode.solutions.s123;

/*
 * @lc app=leetcode id=123 lang=java
 *
 * [123] Best Time to Buy and Sell Stock III
 */

// @lc code=start
class Solution {
  public int maxProfit(int[] prices) {
    int n = prices.length;
    int sell1 = 0, sell2 = 0;
    int buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      buy1 = Integer.max(buy1, -prices[i]);
      sell1 = Integer.max(sell1, prices[i] + buy1);
      buy2 = Integer.max(buy2, sell1 - prices[i]);
      sell2 = Integer.max(sell2, prices[i] + buy2);
    }
    return sell2;
  }
}
// @lc code=end
