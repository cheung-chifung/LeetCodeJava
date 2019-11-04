package com.chifungcheung.leetcode.solutions.s4;

/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int len1 = nums1.length, len2 = nums2.length;
    int left = (len1 + len2 + 1) / 2;
    int right = (len1 + len2 + 2) / 2;
    return (getKth(nums1, 0, len1, nums2, 0, len2, left) + getKth(nums1, 0, len1, nums2, 0, len2, right)) / 2;
  }

  private double getKth(int[] nums1, int start1, int len1, int[] nums2, int start2, int len2, int k) {
    if (len1 > len2) {
      return getKth(nums2, start2, len2, nums1, start1, len1, k);
    }
    if (len1 == 0) {
      return nums2[start2 + k - 1];
    }
    if (k == 1) {
      return Integer.min(nums1[start1], nums2[start2]);
    }
    int i = Integer.min(len1, k / 2);
    int j = Integer.min(len2, k / 2);
    if (nums1[start1 + i - 1] < nums2[start2 + j - 1]) {
      return getKth(nums1, start1 + i, len1 - i, nums2, start2, len2, k - i);
    }
    return getKth(nums1, start1, len1, nums2, start2 + j, len2 - j, k - j);
  }
}
// @lc code=end
