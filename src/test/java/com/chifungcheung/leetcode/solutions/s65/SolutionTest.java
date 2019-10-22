package com.chifungcheung.leetcode.solutions.s65;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    assertEquals(sol.isNumber(".-4"), false);
    assertEquals(sol.isNumber("6+1"), false);
    assertEquals(sol.isNumber("."), false);
    assertEquals(sol.isNumber("3."), true);
    assertEquals(sol.isNumber("0"), true);
    assertEquals(sol.isNumber(" 0.1 "), true);
    assertEquals(sol.isNumber("abc"), false);
    assertEquals(sol.isNumber("1 a"), false);
    assertEquals(sol.isNumber("2e10"), true);
    assertEquals(sol.isNumber(" -90e3 "), true);
    assertEquals(sol.isNumber(" 1e"), false);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    assertEquals(sol.isNumber("e3"), false);
    assertEquals(sol.isNumber(" 6e-1"), true);
    assertEquals(sol.isNumber(" 99e2.5 "), false);
    assertEquals(sol.isNumber("53.5e93"), true);
    assertEquals(sol.isNumber(" --6 "), false);
    assertEquals(sol.isNumber("-+3"), false);
    assertEquals(sol.isNumber("95a54e53"), false);
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    assertEquals(sol.isNumber("32.e-80123"), true);
  }
}
