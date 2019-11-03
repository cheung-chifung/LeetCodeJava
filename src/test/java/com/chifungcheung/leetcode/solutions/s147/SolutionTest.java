package com.chifungcheung.leetcode.solutions.s147;

import com.chifungcheung.leetcode.data.ListNode;
import com.chifungcheung.leetcode.data.ListNodeAssert;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    ListNode head = ListNode.fromArray(new int[] { 4, 2, 1, 3 });
    ListNode ans = sol.insertionSortList(head);
    ListNodeAssert.assertListNodeEquals(new int[] { 1, 2, 3, 4 }, ans);
  }

  @Test
  public void testSolution002() {
    ListNode head = ListNode.fromArray(new int[] { -1, 5, 3, 4, 0 });
    ListNode ans = sol.insertionSortList(head);
    ListNodeAssert.assertListNodeEquals(new int[] { -1, 0, 3, 4, 5 }, ans);
  }

  @Test
  public void testSolution003() {
    ListNode head = ListNode.fromArray(new int[] { 1, 1 });
    ListNode ans = sol.insertionSortList(head);
    ListNodeAssert.assertListNodeEquals(new int[] { 1, 1 }, ans);
  }
}
