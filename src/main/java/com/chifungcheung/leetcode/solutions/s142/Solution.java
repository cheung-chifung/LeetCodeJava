package com.chifungcheung.leetcode.solutions.s142;

import com.chifungcheung.leetcode.data.ListNode;

/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
public class Solution {
  public ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null) {
      return null;
    }
    ListNode fast = head;
    ListNode slow = head;
    boolean isCycle = false;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        isCycle = true;
        break;
      }
    }
    if (!isCycle) {
      return null;
    }
    while (slow != head) {
      head = head.next;
      slow = slow.next;
    }
    return head;
  }
}
// @lc code=end

// 1: 0, 2
// 2: 2, 0
// 3: -4, -4
// slow: IN + Encounter
// fast: IN + Encounter + n * Cycle

// 1: 2, 1
// 2: 1, 1