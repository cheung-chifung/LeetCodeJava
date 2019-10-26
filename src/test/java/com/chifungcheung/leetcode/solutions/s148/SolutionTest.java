package com.chifungcheung.leetcode.solutions.s148;

import com.chifungcheung.leetcode.data.ListNode;
import com.chifungcheung.leetcode.data.ListNodeAssert;
import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    ListNode head = ListNode.fromArray(new int[] {4, 2, 1, 3});
    head = sol.sortList(head);
    ListNodeAssert.assertListNodeEquals(new int[] {1, 2, 3, 4}, head);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    ListNode head = ListNode.fromArray(new int[] {-1, 5, 3, 4, 0});
    head = sol.sortList(head);
    ListNodeAssert.assertListNodeEquals(new int[] {-1, 0, 3, 4, 5}, head);
  }
}
