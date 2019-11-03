package com.chifungcheung.leetcode.solutions.s1248;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
  public int numberOfSubarrays(int[] nums, int k) {
    int n = nums.length;
    if (n < k || k == 0) {
      return 0;
    }
    int ans = 0;
    int lastStart = -1;
    Queue<Integer> queue = new LinkedList<Integer>();
    for (int i = 0; i < n; i++) {
      if (nums[i] % 2 == 1) {
        queue.offer(i - lastStart);
        lastStart = i;
      }
      if (queue.size() > k) {
        queue.poll();
      }
      if (queue.size() == k) {
        ans += queue.peek();
      }

    }
    return ans;
  }
}