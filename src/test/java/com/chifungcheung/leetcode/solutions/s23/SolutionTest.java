package com.chifungcheung.leetcode.solutions.s23;

import com.chifungcheung.leetcode.data.ListNode;
import com.chifungcheung.leetcode.data.ListNodeAssert;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();

    ListNode h1 = ListNode.fromArray(new int[] { 1, 4, 5 });
    ListNode h2 = ListNode.fromArray(new int[] { 1, 3, 4 });
    ListNode h3 = ListNode.fromArray(new int[] { 2, 6 });

    ListNode ans = sol.mergeKLists(new ListNode[] { h1, h2, h3 });
    int[] expected = new int[] { 1, 1, 2, 3, 4, 4, 5, 6 };
    ListNodeAssert.assertListNodeEquals(expected, ans);
  }
}
