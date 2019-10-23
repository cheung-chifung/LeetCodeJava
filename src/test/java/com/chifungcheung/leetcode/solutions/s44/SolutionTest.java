package com.chifungcheung.leetcode.solutions.s44;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    Solution sol = new Solution();
    boolean ans = sol.isMatch("aa", "a");
    assertEquals(false, ans);
  }

  @Test
  public void testSolution002() {
    Solution sol = new Solution();
    boolean ans = sol.isMatch("aa", "*");
    assertEquals(true, ans);
  }

  @Test
  public void testSolution003() {
    Solution sol = new Solution();
    boolean ans = sol.isMatch("cb", "?a");
    assertEquals(false, ans);
  }

  @Test
  public void testSolution004() {
    Solution sol = new Solution();
    boolean ans = sol.isMatch("abceb", "*a*b");
    assertEquals(true, ans);
  }

  @Test
  public void testSolution005() {
    Solution sol = new Solution();
    boolean ans = sol.isMatch("acdcb", "a*c?b");
    assertEquals(false, ans);
  }

  @Test
  public void testSolution006() {
    Solution sol = new Solution();
    boolean ans = sol.isMatch("a", "*a");
    assertEquals(true, ans);
  }

  @Test
  public void testSolution007() {
    Solution sol = new Solution();
    boolean ans = sol.isMatch("", "*");
    assertEquals(true, ans);
  }

  @Test
  public void testSolution008() {
    Solution sol = new Solution();
    boolean ans = sol.isMatch("abcd", "");
    assertEquals(false, ans);
  }

  @Test
  public void testSolution009() {
    Solution sol = new Solution();
    boolean ans = sol.isMatch("", "");
    assertEquals(true, ans);
  }

  @Test
  public void testSolution010() {
    Solution sol = new Solution();
    boolean ans = sol.isMatch("ho", "**ho");
    assertEquals(true, ans);
  }

  @Test
  public void testSolution011() {
    Solution sol = new Solution();
    boolean ans = sol.isMatch("aab", "c*a*b");
    assertEquals(false, ans);
  }
}
