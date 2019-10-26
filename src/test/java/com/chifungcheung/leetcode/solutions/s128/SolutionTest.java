package com.chifungcheung.leetcode.solutions.s128;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    int ans = sol.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2});
    assertEquals(4, ans);
  }
}
