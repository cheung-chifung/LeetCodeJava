package com.chifungcheung.leetcode.solutions.s129;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=129 lang=java
 *
 * [129] Sum Root to Leaf Numbers
 */

// @lc code=start
class Solution {
  public int sumNumbers(TreeNode root) {
    return this.sumSubTree(root, 0);
  }

  private int sumSubTree(TreeNode root, int sum) {
    if (root == null) {
      return 0;
    }
    sum = sum * 10 + root.val;
    if (root.left == null && root.right == null) {
      return sum;
    }
    return this.sumSubTree(root.left, sum) + this.sumSubTree(root.right, sum);
  }
}
// @lc code=end

