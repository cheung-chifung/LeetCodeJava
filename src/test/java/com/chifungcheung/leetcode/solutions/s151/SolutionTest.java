package com.chifungcheung.leetcode.solutions.s151;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    String ans = sol.reverseWords(" the sky  is blue  ");
    assertEquals("blue is sky the", ans);
  }
}
