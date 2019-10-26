package com.chifungcheung.leetcode.solutions.s206;

import com.chifungcheung.leetcode.data.ListNode;

/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

// @lc code=start
class Solution {
  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode prev = null;
    ListNode next = null;
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
