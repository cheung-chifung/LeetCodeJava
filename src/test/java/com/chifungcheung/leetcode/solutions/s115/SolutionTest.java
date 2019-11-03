package com.chifungcheung.leetcode.solutions.s115;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    assertEquals(3, sol.numDistinct("rabbbit", "rabbit"));
  }

  @Test
  public void testSolution002() {
    assertEquals(5, sol.numDistinct("babgbag", "bag"));
  }
}
