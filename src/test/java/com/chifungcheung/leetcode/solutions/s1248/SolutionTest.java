package com.chifungcheung.leetcode.solutions.s1248;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    int ans = sol.numberOfSubarrays(new int[] { 1, 1, 2, 1, 1 }, 3);
    assertEquals(2, ans);
  }
}
