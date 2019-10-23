package com.chifungcheung.leetcode.solutions.s191;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();

    int ans = sol.hammingWeight(11);
    assertEquals(3, ans);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();

    int ans = sol.hammingWeight(128);
    assertEquals(1, ans);
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();

    int ans = sol.hammingWeight(-3);
    assertEquals(31, ans);
  }
}
