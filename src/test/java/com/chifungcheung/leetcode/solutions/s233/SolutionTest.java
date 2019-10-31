package com.chifungcheung.leetcode.solutions.s233;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    assertEquals(6, sol.countDigitOne(13));
  }

  @Test
  public void testSolution002() {
    assertEquals(154, sol.countDigitOne(234));
  }

  @Test
  public void testSolution003() {
    assertEquals(20, sol.countDigitOne(99));
  }

  @Test
  public void testSolution004() {
    assertEquals(1, sol.countDigitOne(3));
  }

  @Test
  public void testSolution005() {
    assertEquals(69, sol.countDigitOne(134));
  }

  @Test
  public void testSolution006() {
    assertEquals(14, sol.countDigitOne(34));
  }

  @Test
  public void testSolution007() {
    assertEquals(26, sol.countDigitOne(104));
  }
}
