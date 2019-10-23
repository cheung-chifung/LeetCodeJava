package com.chifungcheung.leetcode.solutions.s347;

/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Map.Entry;

class Solution {
  public List<Integer> topKFrequent(int[] nums, int k) {
    List<Integer> ans = new ArrayList<>();
    if (nums.length == 0 || k == 0) {
      return ans;
    }

    HashMap<Integer, Integer> d = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int c = d.getOrDefault(nums[i], 0);
      d.put(nums[i], ++c);
    }

    PriorityQueue<Entry<Integer, Integer>> stack = new PriorityQueue<>(k, (e1, e2) -> e2.getValue() - e1.getValue());
    for (Entry<Integer, Integer> e : d.entrySet()) {
      stack.add(e);
    }
    while (!stack.isEmpty() && k > 0) {
      ans.add(stack.poll().getKey());
      k--;
    }
    return ans;
  }
}
// @lc code=end
