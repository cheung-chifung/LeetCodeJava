package com.chifungcheung.leetcode.solutions.s147;

import com.chifungcheung.leetcode.data.ListNode;

/*
 * @lc app=leetcode id=147 lang=java
 *
 * [147] Insertion Sort List
 */

// @lc code=start
class Solution {
  public ListNode insertionSortList(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode dummy = new ListNode(Integer.MIN_VALUE);
    dummy.next = head;

    while (head != null) {
      ListNode next = head.next;
      head.next = null;
      ListNode c = dummy;
      while (c != null) {
        if (c.next == null || head.val < c.next.val) {
          ListNode cn = c.next;
          c.next = head;
          head.next = cn;
          break;
        } else {
          c = c.next;
        }
      }
      head = next;
    }

    return dummy.next;
  }
}
// @lc code=end
