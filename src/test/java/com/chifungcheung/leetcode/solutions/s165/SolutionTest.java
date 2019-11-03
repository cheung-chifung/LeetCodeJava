package com.chifungcheung.leetcode.solutions.s165;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    int ans = sol.compareVersion("0.1", "1.1");
    assertEquals(-1, ans);
  }

  @Test
  public void testSolution002() {
    int ans = sol.compareVersion("1.0.1", "1");
    assertEquals(1, ans);
  }

  @Test
  public void testSolution003() {
    int ans = sol.compareVersion("7.5.2.4", "7.5.3");
    assertEquals(-1, ans);
  }

  @Test
  public void testSolution004() {
    int ans = sol.compareVersion("1.01", "1.001");
    assertEquals(0, ans);
  }

  @Test
  public void testSolution005() {
    int ans = sol.compareVersion("1.0", "1.0.0");
    assertEquals(0, ans);
  }
}
