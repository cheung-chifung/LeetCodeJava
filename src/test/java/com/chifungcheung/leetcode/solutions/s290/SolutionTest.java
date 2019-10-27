package com.chifungcheung.leetcode.solutions.s290;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    assertEquals(true, sol.wordPattern("abba", "dog cat cat dog"));
  }

  @Test
  public void testSolution002() {
    assertEquals(false, sol.wordPattern("abba", "dog cat cat fish"));
  }

  @Test
  public void testSolution003() {
    assertEquals(false, sol.wordPattern("aaaa", "dog cat cat dog"));
  }

  @Test
  public void testSolution004() {
    assertEquals(false, sol.wordPattern("abba", "dog dog dog dog"));
  }
}
