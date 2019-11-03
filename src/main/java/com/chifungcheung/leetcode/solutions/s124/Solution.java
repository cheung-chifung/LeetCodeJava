package com.chifungcheung.leetcode.solutions.s124;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=124 lang=java
 *
 * [124] Binary Tree Maximum Path Sum
 */

// @lc code=start
class Solution {
  class Max {
    int value;
  }

  public int maxPathSum(TreeNode root) {
    Max max = new Max();
    max.value = Integer.MIN_VALUE;
    int all = maxSubPathSum(root, max);
    max.value = Math.max(max.value, all);
    return max.value;
  }

  private int maxSubPathSum(TreeNode root, Max max) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      max.value = Math.max(max.value, root.val);
      return root.val;
    }
    int maxLeft = maxSubPathSum(root.left, max);
    int maxRight = maxSubPathSum(root.right, max);
    int localMax = root.val;
    if (maxLeft > 0) {
      localMax += maxLeft;
    }
    if (maxRight > 0) {
      localMax += maxRight;
    }
    max.value = Math.max(max.value, localMax);
    int branchMax = Math.max(maxLeft, maxRight);
    if (branchMax > 0) {
      return root.val + branchMax;
    }
    return root.val;
  }
}
// @lc code=end
