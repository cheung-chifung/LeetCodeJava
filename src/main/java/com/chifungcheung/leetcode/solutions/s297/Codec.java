package com.chifungcheung.leetcode.solutions.s297;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

import com.chifungcheung.leetcode.data.TreeNode;

/*
 * @lc app=leetcode id=297 lang=java
 *
 * [297] Serialize and Deserialize Binary Tree
 */

// @lc code=start
public class Codec {

  // Encodes a tree to a single string.
  public String serialize(TreeNode root) {
    Stack<Integer> ans = new Stack<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if (root == null) {
      return "[]";
    }
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      if (node != null) {
        ans.add(node.val);
        queue.add(node.left);
        queue.add(node.right);
      } else {
        ans.add(null);
      }
    }
    while (!ans.isEmpty()) {
      Integer p = ans.peek();
      if (p == null) {
        ans.pop();
      } else {
        break;
      }
    }

    StringBuilder sb = new StringBuilder();
    boolean isFirst = true;
    sb.append('[');
    for (Integer num : ans) {
      if (!isFirst) {
        sb.append(',');
      }
      isFirst = false;
      if (num == null) {
        sb.append("null");
      } else {
        sb.append(String.valueOf(num));
      }
    }
    sb.append(']');
    return sb.toString();
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    String[] strArr = data.substring(1, data.length() - 1).split(",");
    if (strArr[0].isEmpty()) {
      return null;
    }
    List<Integer> nums = Arrays.asList(strArr).stream().map(o1 -> o1.equals("null") ? null : Integer.valueOf(o1))
        .collect(Collectors.toList());
    if (nums.isEmpty()) {
      return null;
    }
    Queue<TreeNode> queue = new LinkedList<>();

    TreeNode head = new TreeNode(nums.get(0));
    queue.add(head);
    int i = 1;
    while (!queue.isEmpty() && i < nums.size()) {
      TreeNode node = queue.poll();
      if (node == null) {
        continue;
      }
      Integer leftNum = i < nums.size() ? nums.get(i) : null;
      Integer rightNum = i + 1 < nums.size() ? nums.get(i + 1) : null;
      if (leftNum != null || rightNum != null) {
        node.left = leftNum == null ? null : new TreeNode(leftNum);
        node.right = rightNum == null ? null : new TreeNode(rightNum);
        queue.offer(node.left);
        queue.offer(node.right);
      }
      i += 2;
    }
    return head;
  }
}

// @lc code=end
