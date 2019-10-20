package com.chifungcheung.leetcode.solutions.s25;

import com.chifungcheung.leetcode.data.ListNode;

/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
 */

// @lc code=start
class Solution {
  public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null || k == 0) {
      return null;
    }
    if (head.next == null || k == 1) {
      return head;
    }

    // get length
    ListNode tmp = head;
    for (int i = k; i > 0; i--) {
      if (tmp == null) {
        return head;
      }
      tmp = tmp.next;
    }

    ListNode dummy = new ListNode(Integer.MIN_VALUE);
    ListNode curr = dummy;
    ListNode next = head;
    for (int i = k; i > 0; i--) {
      if (next == null) {
        break;
      }
      ListNode next2 = next.next;
      next.next = curr;
      curr = next;
      next = next2;
    }

    head.next = this.reverseKGroup(next, k);
    return curr;
  }
}
// @lc code=end
