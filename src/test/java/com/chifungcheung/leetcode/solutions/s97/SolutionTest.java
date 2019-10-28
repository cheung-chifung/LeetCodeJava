package com.chifungcheung.leetcode.solutions.s97;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    String s1 = "aabcc";
    String s2 = "dbbca";
    String s3 = "aadbbcbcac";
    assertEquals(true, sol.isInterleave(s1, s2, s3));
  }

  @Test
  public void testSolution002() {
    String s1 = "aabcc";
    String s2 = "dbbca";
    String s3 = "aadbbbaccc";
    assertEquals(false, sol.isInterleave(s1, s2, s3));
  }

  @Test
  public void testSolution003() {
    String s1 = "";
    String s2 = "dbbca";
    String s3 = "dbbca";
    assertEquals(true, sol.isInterleave(s1, s2, s3));
  }

  @Test
  public void testSolution004() {
    String s1 = "";
    String s2 = "";
    String s3 = "a";
    assertEquals(false, sol.isInterleave(s1, s2, s3));
  }

  @Test
  public void testSolution005() {
    String s1 = "a";
    String s2 = "";
    String s3 = "aa";
    assertEquals(false, sol.isInterleave(s1, s2, s3));
  }

  @Test
  public void testSolution006() {
    String s1 = "db";
    String s2 = "b";
    String s3 = "cbb";
    assertEquals(false, sol.isInterleave(s1, s2, s3));
  }

  @Test
  public void testSolution007() {
    String s1 = "ab";
    String s2 = "b";
    String s3 = "ab";
    assertEquals(false, sol.isInterleave(s1, s2, s3));
  }
}
