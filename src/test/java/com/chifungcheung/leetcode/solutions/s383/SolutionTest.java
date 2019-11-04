package com.chifungcheung.leetcode.solutions.s383;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    assertEquals(false, sol.canConstruct("aab", "abc"));
  }

  @Test
  public void testSolution002() {
    assertEquals(false, sol.canConstruct("a", "b"));
  }

  @Test
  public void testSolution003() {
    assertEquals(false, sol.canConstruct("aa", "ab"));
  }

  @Test
  public void testSolution004() {
    assertEquals(true, sol.canConstruct("aa", "aab"));
  }
}
