package com.chifungcheung.leetcode.solutions.s82;

import com.chifungcheung.leetcode.data.ListNode;

/*
 * @lc app=leetcode id=82 lang=java
 *
 * [82] Remove Duplicates from Sorted List II
 */

// @lc code=start
class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode prev = dummy;
    while (head != null) {
      ListNode next = head.next;
      int dup = 0;
      while (next != null && next.val == head.val) {
        next = next.next;
        dup++;
      }
      if (dup > 0) {
        prev.next = next;
        head = prev.next;
      } else {
        prev = prev.next;
        head = head.next;
      }
    }
    return dummy.next;
  }
}
// @lc code=end
