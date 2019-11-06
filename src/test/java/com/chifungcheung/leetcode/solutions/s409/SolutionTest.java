package com.chifungcheung.leetcode.solutions.s409;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    assertEquals(7, sol.longestPalindrome("abccccdd"));
  }

  @Test
  public void testSolution002() {
    assertEquals(1, sol.longestPalindrome("a"));
  }

  @Test
  public void testSolution003() {
    assertEquals(1, sol.longestPalindrome("ab"));
  }

  @Test
  public void testSolution004() {
    assertEquals(3, sol.longestPalindrome("aab"));
  }

  @Test
  public void testSolution005() {
    assertEquals(2, sol.longestPalindrome("aa"));
  }
}
