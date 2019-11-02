package com.chifungcheung.leetcode.solutions.s76;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    String ans = sol.minWindow("ADOBECODEBANC", "ABC");
    assertEquals("BANC", ans);
  }

  @Test
  public void testSolution002() {
    String ans = sol.minWindow("cabwefgewcwaefgcf", "cae");
    assertEquals("cwae", ans);
  }
}
