package com.chifungcheung.leetcode.solutions.s142;

import static org.junit.Assert.assertEquals;

import com.chifungcheung.leetcode.data.ListNode;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    ListNode head = ListNode.fromArray(new int[] { 3, 2, 0, -4 });
    head.next.next.next.next = head.next;
    head = sol.detectCycle(head);
    assertEquals(2, head.val);
  }

  @Test
  public void testSolution002() {
    ListNode head = ListNode.fromArray(new int[] { 1, 2 });
    head.next.next = head;
    head = sol.detectCycle(head);
    assertEquals(1, head.val);
  }

  @Test
  public void testSolution003() {
    ListNode head = ListNode.fromArray(new int[] { 1 });
    head = sol.detectCycle(head);
    assertEquals(null, head);
  }

  @Test
  public void testSolution004() {
    ListNode head = ListNode.fromArray(new int[] { 1, 2 });
    head = sol.detectCycle(head);
    assertEquals(null, head);
  }

  @Test
  public void testSolution005() {
    ListNode head = ListNode.fromArray(new int[] { 1, 2, 3, 4 });
    head = sol.detectCycle(head);
    assertEquals(null, head);
  }
}
