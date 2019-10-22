package com.chifungcheung.leetcode.solutions.s102;

import java.util.ArrayList;
import java.util.List;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
 */

// @lc code=start
class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();

    this.traversal(root, 1, ans);

    return ans;
  }

  private void traversal(TreeNode root, int depth, List<List<Integer>> ans) {
    if (root == null) {
      return;
    }
    if (ans.size() < depth) {
      ans.add(new ArrayList<>());
    }
    List<Integer> level = ans.get(depth - 1);
    level.add(root.val);
    this.traversal(root.left, depth + 1, ans);
    this.traversal(root.right, depth + 1, ans);
  }
}
// @lc code=end
