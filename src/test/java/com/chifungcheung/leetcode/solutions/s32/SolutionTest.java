package com.chifungcheung.leetcode.solutions.s32;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    int ans = sol.longestValidParentheses("(()");
    assertEquals(2, ans);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    int ans = sol.longestValidParentheses(")()())");
    assertEquals(4, ans);
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    int ans = sol.longestValidParentheses("))(()())(");
    assertEquals(6, ans);
  }
}
