package com.chifungcheung.leetcode.solutions.s21;

import com.chifungcheung.leetcode.data.ListNode;
import com.chifungcheung.leetcode.data.ListNodeAssert;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    ListNode l1 = ListNode.fromArray(new int[] { 1, 2, 4 });
    ListNode l2 = ListNode.fromArray(new int[] { 1, 3, 4 });
    ListNode ans = sol.mergeTwoLists(l1, l2);
    ListNodeAssert.assertListNodeEquals(new int[] { 1, 1, 2, 3, 4, 4 }, ans);
  }

  @Test
  public void testSolution002() {
    ListNode l1 = ListNode.fromArray(new int[] { 1 });
    ListNode l2 = ListNode.fromArray(new int[] { 1, 3, 4 });
    ListNode ans = sol.mergeTwoLists(l1, l2);
    ListNodeAssert.assertListNodeEquals(new int[] { 1, 1, 3, 4 }, ans);
  }

  @Test
  public void testSolution003() {
    ListNode l1 = ListNode.fromArray(new int[] {});
    ListNode l2 = ListNode.fromArray(new int[] { 1, 3, 4 });
    ListNode ans = sol.mergeTwoLists(l1, l2);
    ListNodeAssert.assertListNodeEquals(new int[] { 1, 3, 4 }, ans);
  }
}
