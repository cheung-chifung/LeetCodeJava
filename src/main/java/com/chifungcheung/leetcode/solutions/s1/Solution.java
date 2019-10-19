package com.chifungcheung.leetcode.solutions.s1;

import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> d = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (d.containsKey(remain)) {
                int[] ans = new int[] { d.get(remain), i };
                return ans;
            }
            d.put(nums[i], i);
        }
        return new int[] {};
    }
}
// @lc code=end
