package com.chifungcheung.leetcode.solutions.s215;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    int ans = sol.findKthLargest(new int[] { 3, 2, 1, 5, 6, 4 }, 2);
    assertEquals(5, ans);
  }

  @Test
  public void testSolution002() {
    int ans = sol.findKthLargest(new int[] { 3, 2, 3, 1, 2, 4, 5, 5, 6 }, 4);
    assertEquals(4, ans);
  }
}
