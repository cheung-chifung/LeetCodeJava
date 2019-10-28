package com.chifungcheung.leetcode.solutions.s868;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution1() {
    int ans = sol.binaryGap(22);
    assertEquals(2, ans);
  }

  @Test
  public void testSolution2() {
    int ans = sol.binaryGap(5);
    assertEquals(2, ans);
  }

  @Test
  public void testSolution3() {
    int ans = sol.binaryGap(6);
    assertEquals(1, ans);
  }

  @Test
  public void testSolution4() {
    int ans = sol.binaryGap(8);
    assertEquals(0, ans);
  }
}
