package com.chifungcheung.leetcode.solutions.s169;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
  public int majorityElement(int[] nums) {
    Map<Integer, Integer> d = new HashMap<>();
    for (int num : nums) {
      int count = d.getOrDefault(num, 0);
      d.put(num, ++count);
    }
    int bar = nums.length / 2;
    for (Entry<Integer, Integer> e : d.entrySet()) {
      if (e.getValue() > bar) {
        return e.getKey();
      }
    }
    return -1;
  }
}
// @lc code=end

