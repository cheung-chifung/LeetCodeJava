package com.chifungcheung.leetcode.solutions.s689;

/*
 * @lc app=leetcode id=689 lang=java
 *
 * [689] Maximum Sum of 3 Non-Overlapping Subarrays
 */

// @lc code=start
class Solution {
  public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
    int n = nums.length;
    int m = n - k + 1;
    int[] combs = new int[m];

    int acc = 0;
    for (int i = 0; i < k; i++) {
      acc += nums[i];
    }
    combs[0] = acc;
    for (int i = 1; i < m; i++) {
      combs[i] = nums[i + k - 1] + combs[i - 1] - nums[i - 1];
    }
    int[] d = new int[m];
    int[] dm = new int[m];
    int max = Integer.MIN_VALUE;
    int maxIndex = Integer.MIN_VALUE;
    for (int i = m - 1; i >= 0; i--) {
      if (max <= combs[i]) {
        max = combs[i];
        maxIndex = i;
      }
      d[i] = max;
      dm[i] = maxIndex;
    }

    int[] ans = new int[3];
    int maxLen = Integer.MIN_VALUE;
    for (int a1 = 0; a1 < m; a1++) {
      for (int a2 = a1 + k; a2 < m - k; a2++) {
        int c = combs[a1] + combs[a2] + d[a2 + k];
        if (c > maxLen) {
          maxLen = c;
          ans = new int[] { a1, a2, dm[a2 + k] };
        }
      }
    }
    return ans;
  }
}
// @lc code=end
