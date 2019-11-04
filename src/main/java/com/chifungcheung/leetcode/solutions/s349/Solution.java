package com.chifungcheung.leetcode.solutions.s349;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    for (int i = 0; i < nums1.length; i++) {
      set1.add(nums1[i]);
    }
    for (int i = 0; i < nums2.length; i++) {
      set2.add(nums2[i]);
    }
    List<Integer> ans = new LinkedList<>();
    for (Integer num : set1) {
      if (set2.contains(num)) {
        ans.add(num);
      }
    }
    return ans.stream().mapToInt(i -> i).toArray();
  }
}
// @lc code=end
