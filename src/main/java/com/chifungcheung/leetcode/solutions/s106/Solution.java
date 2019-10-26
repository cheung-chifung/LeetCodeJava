package com.chifungcheung.leetcode.solutions.s106;

import java.util.HashMap;
import java.util.Map;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=106 lang=java
 *
 * [106] Construct Binary Tree from Inorder and Postorder Traversal
 */

// @lc code=start
class Solution {
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    Map<Integer, Integer> d = new HashMap<Integer, Integer>();
    for (int i = 0; i < inorder.length; i++) {
      d.put(inorder[i], i);
    }
    return this.buildSubTree(postorder.length - 1, 0, inorder.length, inorder, postorder, d);
  }

  public TreeNode buildSubTree(int postStart, int inLeft, int inRight, int[] inorder, int[] postorder,
      Map<Integer, Integer> d) {
    if (inLeft >= inRight || postStart < 0 || postStart >= postorder.length) {
      return null;
    }
    int rootNum = postorder[postStart];
    int inIndex = d.getOrDefault(rootNum, -1);
    if (inIndex < inLeft || inIndex >= inRight) {
      return null;
    }

    TreeNode root = new TreeNode(rootNum);

    root.left = this.buildSubTree(postStart - (inRight - inIndex - 1) - 1, inLeft, inIndex, inorder, postorder, d);
    root.right = this.buildSubTree(postStart - 1, inIndex + 1, inRight, inorder, postorder, d);
    return root;
  }
}
// @lc code=end
