package com.chifungcheung.leetcode.solutions.s373;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=373 lang=java
 *
 * [373] Find K Pairs with Smallest Sums
 */

// @lc code=start
class Solution {
  class Item implements Comparable<Item> {
    int x;
    int y;
    int val;

    Item(int x, int y, int val) {
      this.x = x;
      this.y = y;
      this.val = val;
    }

    public int compareTo(Item that) {
      return this.val - that.val;
    }
  }

  public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
    List<List<Integer>> ans = new LinkedList<>();
    PriorityQueue<Item> minheap = new PriorityQueue<>();

    for (int i = 0; i < nums1.length; i++) {
      for (int j = 0; j < nums2.length; j++) {
        minheap.offer(new Item(i, j, nums1[i] + nums2[j]));
      }
    }
    while (k-- > 0 && !minheap.isEmpty()) {
      Item item = minheap.poll();
      ans.add(Arrays.asList(nums1[item.x], nums2[item.y]));
    }
    return ans;
  }
}
// @lc code=end
