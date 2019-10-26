package com.chifungcheung.leetcode.solutions.s190;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();

    int ans = sol.reverseBits(43261596);
    assertEquals(964176192, ans);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();

    int ans = sol.reverseBits(-3);
    assertEquals(-1073741825, ans);
  }
}
