package com.chifungcheung.leetcode.solutions.s150;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    int s = sol.evalRPN(new String[] { "2", "1", "+", "3", "*" });
    assertEquals(9, s);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    int s = sol.evalRPN(new String[] { "4", "13", "5", "/", "+" });
    assertEquals(6, s);
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    int s = sol.evalRPN(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" });
    assertEquals(22, s);
  }
}
