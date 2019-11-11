package com.chifungcheung.leetcode.solutions.s92;

import com.chifungcheung.leetcode.data.ListNode;

/*
 * @lc app=leetcode id=92 lang=java
 *
 * [92] Reverse Linked List II
 */

// @lc code=start
class Solution {
  public ListNode reverseBetween(ListNode head, int m, int n) {
    if (head == null) {
      return null;
    }
    ListNode dummy = new ListNode(-1);
    ListNode prev = dummy;
    dummy.next = head;

    int i = 1;
    while (i < m) {
      prev = head;
      head = head.next;
      i++;
    }
    while (i < n) {
      ListNode next = head.next;
      ListNode nextNext = next.next;
      ListNode prevNext = prev.next;
      prev.next = next;
      prev.next.next = prevNext;
      head.next = nextNext;
      i++;
    }
    return dummy.next;
  }
}
// @lc code=end
