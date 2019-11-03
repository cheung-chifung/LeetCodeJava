package com.chifungcheung.leetcode.solutions.s287;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution1() {
    int ans = sol.findDuplicate(new int[] { 1, 3, 4, 2, 2 });
    assertEquals(2, ans);
  }

  @Test
  public void testSolution2() {
    int ans = sol.findDuplicate(new int[] { 3, 1, 3, 4, 2 });
    assertEquals(3, ans);
  }
}
