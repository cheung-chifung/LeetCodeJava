package com.chifungcheung.leetcode.solutions.s215;

/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {
  public int findKthLargest(int[] nums, int k) {
    k = nums.length - k;
    int l = 0, r = nums.length - 1;
    while (l <= r) {
      int i = l;
      for (int j = i + 1; j <= r; j++) {
        if (nums[j] < nums[l]) {
          swap(nums, ++i, j);
        }
      }
      swap(nums, l, i);

      if (k < i) {
        r = i - 1;
      } else if (k > i) {
        l = i + 1;
      } else {
        return nums[i];
      }
    }
    return -1;
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
// @lc code=end
