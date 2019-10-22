package com.chifungcheung.leetcode.solutions.s103;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=103 lang=java
 *
 * [103] Binary Tree Level Order Traversal
 */

// @lc code=start
class Solution {
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();

    this.traversal(root, 1, ans);

    for (int i = 0; i < ans.size(); i++) {
      if (i % 2 == 1) {
        List<Integer> level = ans.get(i);
        Collections.reverse(level);
      }
    }

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
