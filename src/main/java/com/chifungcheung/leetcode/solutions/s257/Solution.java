package com.chifungcheung.leetcode.solutions.s257;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
 */

// @lc code=start
class Solution {
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> ans = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();

    this.dfs(root, stack, ans);
    return ans;
  }

  private void dfs(TreeNode root, Stack<Integer> stack, List<String> ans) {
    if (root == null) {
      return;
    }
    stack.push(root.val);
    if (root.left == null && root.right == null) {
      String path = this.printPath(stack);
      if (path != null) {
        ans.add(path);
      }
      stack.pop();
      return;
    }
    this.dfs(root.left, stack, ans);
    this.dfs(root.right, stack, ans);
    stack.pop();
  }

  private String printPath(Stack<Integer> stack) {
    if (stack.empty()) {
      return null;
    }
    return stack.stream().map(Object::toString).collect(Collectors.joining("->"));
  }
}
// @lc code=end
