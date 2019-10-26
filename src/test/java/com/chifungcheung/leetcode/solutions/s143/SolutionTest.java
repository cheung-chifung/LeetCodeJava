package com.chifungcheung.leetcode.solutions.s143;

import com.chifungcheung.leetcode.data.ListNode;
import com.chifungcheung.leetcode.data.ListNodeAssert;
import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    ListNode head = ListNode.fromArray(new int[] {1, 2, 3, 4});
    sol.reorderList(head);
    ListNodeAssert.assertListNodeEquals(new int[] {1, 4, 2, 3}, head);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    ListNode head = ListNode.fromArray(new int[] {1, 2, 3, 4, 5});
    sol.reorderList(head);
    ListNodeAssert.assertListNodeEquals(new int[] {1, 5, 2, 4, 3}, head);
  }
}
