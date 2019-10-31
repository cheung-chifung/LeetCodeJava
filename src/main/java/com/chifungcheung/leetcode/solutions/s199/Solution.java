package com.chifungcheung.leetcode.solutions.s199;

import java.util.LinkedList;
import java.util.List;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=199 lang=java
 *
 * [199] Binary Tree Right Side View
 */

// @lc code=start
class Solution {
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> ans = new LinkedList<>();
    dfs(root, 1, ans);
    return ans;
  }

  private void dfs(TreeNode root, int depth, List<Integer> ans) {
    if (root == null) {
      return;
    }

    if (ans.size() < depth) {
      ans.add(null);
    }

    ans.set(depth - 1, root.val);

    dfs(root.left, depth + 1, ans);
    dfs(root.right, depth + 1, ans);
  }
}
// @lc code=end
