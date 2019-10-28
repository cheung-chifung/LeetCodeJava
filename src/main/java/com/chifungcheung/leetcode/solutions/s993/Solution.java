package com.chifungcheung.leetcode.solutions.s993;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=993 lang=java
 *
 * [993] Cousins in Binary Tree
 */

// @lc code=start
class Solution {
  class Result {
    TreeNode parent;
    int depth;
  }

  public boolean isCousins(TreeNode root, int x, int y) {
    if (x == y) {
      return false;
    }
    List<Result> ans = new ArrayList<>();
    dfs(root, null, x, y, 0, ans);
    if (ans.size() != 2) {
      return false;
    }
    Result res1 = ans.get(0), res2 = ans.get(1);
    if (res1.depth != res2.depth) {
      return false;
    }
    if (res1.parent.val == res2.parent.val) {
      return false;
    }
    return true;
  }

  private void dfs(TreeNode root, TreeNode parent, int x, int y, int depth, List<Result> ans) {
    if (root == null) {
      return;
    }
    if (root.val == x || root.val == y) {
      if (parent != null) {
        Result res = new Result();
        res.parent = parent;
        res.depth = depth;
        ans.add(res);
      }
    }
    this.dfs(root.left, root, x, y, depth + 1, ans);
    this.dfs(root.right, root, x, y, depth + 1, ans);
  }
}
// @lc code=end
