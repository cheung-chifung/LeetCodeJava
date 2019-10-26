package com.chifungcheung.leetcode.solutions.s143;

import com.chifungcheung.leetcode.data.ListNode;

/*
 * @lc app=leetcode id=143 lang=java
 *
 * [143] Reorder List
 */

// @lc code=start
class Solution {
  public void reorderList(ListNode head) {
    if (head == null || head.next == null) {
      return;
    }

    // find the mid point with fast/slow pointers
    ListNode fp = head;
    ListNode sp = head;
    while (fp.next != null && fp.next.next != null) {
      fp = fp.next.next;
      sp = sp.next;
    }

    // break down
    ListNode l2 = sp.next;
    sp.next = null;

    // reverse the latter list
    l2 = reverse(l2);

    // merge
    ListNode next = l2;
    while (next != null) {
      ListNode n1 = head.next;
      ListNode n2 = next.next;
      head.next = next;
      next.next = n1;
      head = n1;
      next = n2;
    }
  }

  private ListNode reverse(ListNode head) {
    ListNode prev = null, next = null;
    while (head != null) {
      next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }
}
// @lc code=end

