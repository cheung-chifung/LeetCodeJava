package com.chifungcheung.leetcode.solutions.s299;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  Solution sol = new Solution();

  @Test
  public void testSolution001() {
    String ans = sol.getHint("1122", "1222");
    assertEquals("3A0B", ans);
  }

  @Test
  public void testSolution002() {
    String ans = sol.getHint("1807", "7810");
    assertEquals("1A3B", ans);
  }

  @Test
  public void testSolution003() {
    String ans = sol.getHint("1123", "0111");
    assertEquals("1A1B", ans);
  }
}
