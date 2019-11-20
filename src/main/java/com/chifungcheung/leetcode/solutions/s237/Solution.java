package com.chifungcheung.leetcode.solutions.s237;

import com.chifungcheung.leetcode.data.ListNode;

/*
 * @lc app=leetcode id=237 lang=java
 *
 * [237] Delete Node in a Linked List
 */

// @lc code=start
class Solution {
  public void deleteNode(ListNode node) {
    while (node != null) {
      if (node.next != null) {
        node.val = node.next.val;
        if (node.next.next == null) {
          node.next = null;
        }
      }
      node = node.next;
    }
  }
}
// @lc code=end
