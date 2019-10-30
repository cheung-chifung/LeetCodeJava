package com.chifungcheung.leetcode.solutions.s583;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    int ans = sol.minDistance("sea", "eat");
    assertEquals(2, ans);
  }

  @Test
  public void testSolution002() {
    int ans = sol.minDistance("gear", "seat");
    assertEquals(4, ans);
  }

  @Test
  public void testSolution003() {
    int ans = sol.minDistance("", "seat");
    assertEquals(4, ans);
  }
}
