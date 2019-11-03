package com.chifungcheung.leetcode.solutions.s167;

/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input array is sorted
 */

// @lc code=start
class Solution {
  public int[] twoSum(int[] numbers, int target) {
    for (int i = 0; i < numbers.length - 1; i++) {
      int needle = find(i + 1, numbers.length - 1, numbers, target - numbers[i]);
      if (numbers[needle] + numbers[i] == target) {
        return new int[] { i + 1, needle + 1 };
      }
    }
    // dead code
    return new int[] { 0, 0 };
  }

  private int find(int l, int r, int[] numbers, int target) {
    while (l < r) {
      int m = l + (r - l) / 2;
      if (numbers[m] < target) {
        l = m + 1;
      } else {
        r = m;
      }
    }
    return l;
  }
}
// @lc code=end
