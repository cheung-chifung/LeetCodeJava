package com.chifungcheung.leetcode.solutions.s239;

import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=239 lang=java
 *
 * [239] Sliding Window Maximum
 */

// @lc code=start
class Solution {
  public int[] maxSlidingWindow(int[] nums, int k) {
    if (nums.length == 0) {
      return nums;
    }
    int[] res = new int[nums.length - k + 1];
    PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
    for (int i = 0; i < k - 1; i++) {
      pq.offer(nums[i]);
    }
    for (int i = 0; i < res.length; i++) {
      pq.offer(nums[k + i - 1]);
      res[i] = pq.peek();
      pq.remove(nums[i]);
    }
    return res;
  }
}
// @lc code=end
