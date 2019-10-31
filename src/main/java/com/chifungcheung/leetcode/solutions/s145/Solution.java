package com.chifungcheung.leetcode.solutions.s145;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=145 lang=java
 *
 * [145] Binary Tree Postorder Traversal
 */

// @lc code=start

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode top = stack.peek();
            if (top.left != null) {
                stack.push(top.left);
                top.left = null;
            } else if (top.right != null) {
                stack.push(top.right);
                top.right = null;
            } else {
                top = stack.pop();
                ans.add(top.val);
            }
        }
        return ans;
    }
}
// @lc code=end
