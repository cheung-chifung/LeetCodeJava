package com.chifungcheung.leetcode.solutions.s113;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode id=113 lang=java
 *
 * [113] Path Sum II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (root == null) {
            return ans;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int acc = root.val;
        // use a negative infinity to mark if a node has been checked
        TreeNode checked = new TreeNode(Integer.MIN_VALUE);
        while (!stack.empty()) {
            TreeNode top = stack.peek();
            if (top.left != null && top.left.val != Integer.MIN_VALUE) {
                stack.push(top.left);
                acc += top.left.val;
                top.left = checked;
            } else if (top.right != null && top.right.val != Integer.MIN_VALUE) {
                stack.push(top.right);
                acc += top.right.val;
                top.right = checked;
            } else {
                if (top.left == null && top.right == null && acc == sum) {
                    List<Integer> row = stack.stream().map(S -> S.val).collect(Collectors.toList());
                    ans.add(row);
                }
                stack.pop();
                acc -= top.val;
            }
        }
        return ans;
    }
}
// @lc code=end
