package com.chifungcheung.leetcode.solutions.s95;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=95 lang=java
 *
 * [95] Unique Binary Search Trees II
 */

// @lc code=start
class Solution {
  public List<TreeNode> generateTrees(int n) {
    if (n == 0) {
      return Arrays.asList();
    }
    return generateTreesWithRange(1, n);
  }

  private List<TreeNode> generateTreesWithRange(int start, int end) {
    if (start > end) {
      return Arrays.asList((TreeNode) null);
    }
    if (start == end) {
      return Arrays.asList(new TreeNode(start));
    }

    List<TreeNode> ans = new LinkedList<>();
    for (int k = start; k <= end; k++) {
      List<TreeNode> leftTree = generateTreesWithRange(start, k - 1);
      List<TreeNode> rightTree = generateTreesWithRange(k + 1, end);
      for (TreeNode left : leftTree) {
        for (TreeNode right : rightTree) {
          TreeNode node = new TreeNode(k);
          node.left = left;
          node.right = right;
          ans.add(node);
        }
      }
    }
    return ans;
  }
}
// @lc code=end
