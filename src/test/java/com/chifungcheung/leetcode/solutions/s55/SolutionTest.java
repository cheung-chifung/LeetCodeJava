package com.chifungcheung.leetcode.solutions.s55;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    assertEquals(true, sol.canJump(new int[] { 2, 3, 1, 1, 4 }));
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    assertEquals(false, sol.canJump(new int[] { 3, 2, 1, 0, 4 }));
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    assertEquals(true, sol.canJump(new int[] { 2, 5, 0, 0 }));
  }
}
