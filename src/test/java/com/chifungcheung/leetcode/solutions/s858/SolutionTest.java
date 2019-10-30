package com.chifungcheung.leetcode.solutions.s858;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    int ans = sol.mirrorReflection(4, 2);
    assertEquals(2, ans);
  }
}
