package com.chifungcheung.leetcode.solutions.s214;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    assertEquals("aaacecaaa", sol.shortestPalindrome("aacecaaa"));
  }
}
