package com.chifungcheung.leetcode.solutions.s23;

import java.util.PriorityQueue;

import com.chifungcheung.leetcode.data.ListNode;

/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 */

// @lc code=start
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode curr = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (n1, n2) -> n1.val - n2.val);
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.add(lists[i]);
            }
        }
        while (pq.size() > 0) {
            ListNode min = pq.poll();
            ListNode next = min.next;
            if (next != null) {
                pq.add(next);
            }
            min.next = null;
            curr.next = min;
            curr = curr.next;
        }
        return dummy.next;
    }
}
// @lc code=end
