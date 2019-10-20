package com.chifungcheung.leetcode.solutions.s25;

import com.chifungcheung.leetcode.data.ListNode;
import com.chifungcheung.leetcode.data.ListNodeAssert;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();

    ListNode l = ListNode.fromArray(new int[] { 1, 2, 3, 4, 5 });
    ListNode ans = sol.reverseKGroup(l, 2);
    int[] expected = new int[] { 2, 1, 4, 3, 5 };
    ListNodeAssert.assertListNodeEquals(expected, ans);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();

    ListNode l = ListNode.fromArray(new int[] { 1, 2, 3, 4, 5 });
    ListNode ans = sol.reverseKGroup(l, 3);
    int[] expected = new int[] { 3, 2, 1, 4, 5 };
    ListNodeAssert.assertListNodeEquals(expected, ans);
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();

    ListNode l = ListNode.fromArray(new int[] { 1 });
    ListNode ans = sol.reverseKGroup(l, 1);
    int[] expected = new int[] { 1 };
    ListNodeAssert.assertListNodeEquals(expected, ans);
  }
}
