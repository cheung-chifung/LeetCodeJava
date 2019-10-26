package com.chifungcheung.leetcode.solutions.s205;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution() {
    Solution sol = new Solution();

    assertEquals(true, sol.isIsomorphic("egg", "add"));
    assertEquals(false, sol.isIsomorphic("foo", "bar"));
    assertEquals(true, sol.isIsomorphic("paper", "title"));
    assertEquals(false, sol.isIsomorphic("ab", "aa"));
  }
}
