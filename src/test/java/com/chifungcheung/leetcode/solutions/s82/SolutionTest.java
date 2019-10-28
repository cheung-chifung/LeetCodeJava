package com.chifungcheung.leetcode.solutions.s82;

import com.chifungcheung.leetcode.data.ListNode;
import com.chifungcheung.leetcode.data.ListNodeAssert;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    ListNode head = ListNode.fromArray(new int[] { 1, 2, 3, 3, 4, 4, 5 });
    head = sol.deleteDuplicates(head);
    ListNodeAssert.assertListNodeEquals(new int[] { 1, 2, 5 }, head);
  }

  @Test
  public void testSolution002() {
    ListNode head = ListNode.fromArray(new int[] { 1, 1, 1, 2, 3 });
    head = sol.deleteDuplicates(head);
    ListNodeAssert.assertListNodeEquals(new int[] { 2, 3 }, head);
  }

  @Test
  public void testSolution003() {
    ListNode head = ListNode.fromArray(new int[] { 1, 1, 1 });
    head = sol.deleteDuplicates(head);
    ListNodeAssert.assertListNodeEquals(new int[] {}, head);
  }
}
