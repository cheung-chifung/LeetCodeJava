package com.chifungcheung.leetcode.solutions.s105;

import java.util.HashMap;
import java.util.Map;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
 */

// @lc code=start
class Solution {
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    Map<Integer, Integer> d = new HashMap<Integer, Integer>();
    for (int i = 0; i < inorder.length; i++) {
      d.put(inorder[i], i);
    }
    return this.buildSubTree(0, 0, preorder.length, preorder, inorder, d);
  }

  public TreeNode buildSubTree(int preStart, int inLeft, int inRight, int[] preorder, int[] inorder,
      Map<Integer, Integer> d) {
    if (inLeft >= inRight || preStart < 0 || preStart >= preorder.length) {
      return null;
    }
    int rootNum = preorder[preStart];
    int inIndex = d.getOrDefault(preorder[preStart], -1);
    if (inIndex < inLeft || inIndex >= inRight) {
      return null;
    }

    TreeNode root = new TreeNode(rootNum);

    root.left = this.buildSubTree(preStart + 1, inLeft, inIndex, preorder, inorder, d);
    root.right = this.buildSubTree(preStart + inIndex - inLeft + 1, inIndex + 1, inRight, preorder, inorder, d);
    return root;
  }
}
// @lc code=end
