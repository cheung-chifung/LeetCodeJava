package com.chifungcheung.leetcode.solutions.s429;

import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=429 lang=java
 *
 * [429] N-ary Tree Level Order Traversal
 */

// @lc code=start
class Solution {
  public List<List<Integer>> levelOrder(Node root) {
    List<List<Integer>> ans = new LinkedList<>();
    traversal(root, 0, ans);
    return ans;
  }

  private void traversal(Node root, int depth, List<List<Integer>> ans) {
    if (root == null) {
      return;
    }
    if (ans.size() < depth + 1) {
      ans.add(new LinkedList<Integer>());
    }
    List<Integer> level = ans.get(depth);
    level.add(root.val);
    for (Node node : root.children) {
      traversal(node, depth + 1, ans);
    }
  }
}
// @lc code=end
