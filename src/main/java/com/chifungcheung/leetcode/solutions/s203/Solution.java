package com.chifungcheung.leetcode.solutions.s203;

import com.chifungcheung.leetcode.data.ListNode;

/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
 */

// @lc code=start
class Solution {
  public ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode(-1);
    ListNode prev = dummy;
    dummy.next = head;

    while (head != null) {
      ListNode next = head.next;
      if (head.val == val) {
        prev.next = head.next;
        head.next = null;
      } else {
        prev = head;
      }
      head = next;
    }

    return dummy.next;
  }
}
// @lc code=end
