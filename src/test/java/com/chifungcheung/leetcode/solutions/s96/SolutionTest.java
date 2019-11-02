package com.chifungcheung.leetcode.solutions.s96;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    int ans = sol.numTrees(3);
    assertEquals(5, ans);
  }

  @Test
  public void testSolution002() {
    int ans = sol.numTrees(4);
    assertEquals(14, ans);
  }

  @Test
  public void testSolution003() {
    int ans = sol.numTrees(5);
    assertEquals(42, ans);
  }
}
