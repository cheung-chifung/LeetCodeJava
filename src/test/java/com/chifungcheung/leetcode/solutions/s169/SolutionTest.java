package com.chifungcheung.leetcode.solutions.s169;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    assertEquals(3, sol.majorityElement(new int[] {3, 2, 3}));
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    assertEquals(2, sol.majorityElement(new int[] {2, 2, 1, 1, 1, 2, 2}));
  }
}
