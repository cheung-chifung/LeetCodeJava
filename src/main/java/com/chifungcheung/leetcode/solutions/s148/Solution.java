package com.chifungcheung.leetcode.solutions.s148;

import com.chifungcheung.leetcode.data.ListNode;

/*
 * @lc app=leetcode id=148 lang=java
 *
 * [148] Sort List
 */

// @lc code=start
class Solution {
  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode fp = head, sp = head;
    while (fp.next != null && fp.next.next != null) {
      fp = fp.next.next;
      sp = sp.next;
    }
    ListNode l1 = head;
    ListNode l2 = sp.next;
    sp.next = null;

    l1 = sortList(l1);
    l2 = sortList(l2);

    return merge(l1, l2);
  }

  private ListNode merge(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(-1), head = dummy;
    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        head.next = l1;
        l1 = l1.next;
      } else {
        head.next = l2;
        l2 = l2.next;
      }
      head = head.next;
    }
    if (l1 != null) {
      head.next = l1;
    }
    if (l2 != null) {
      head.next = l2;
    }
    return dummy.next;
  }
}
// @lc code=end

