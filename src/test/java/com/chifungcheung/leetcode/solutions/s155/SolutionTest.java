package com.chifungcheung.leetcode.solutions.s155;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    int ans = 0;
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    ans = minStack.getMin(); // --> Returns -3.
    assertEquals(-3, ans);
    minStack.pop();
    ans = minStack.top(); // --> Returns 0.
    assertEquals(0, ans);
    ans = minStack.getMin(); // --> Returns -2.
    assertEquals(-2, ans);
  }

  @Test
  public void testSolution002() {
    int ans = 0;
    MinStack minStack = new MinStack();
    minStack.push(512);
    minStack.push(-1024);
    minStack.push(-1024);
    minStack.push(512);
    minStack.pop();
    ans = minStack.getMin();
    assertEquals(-1024, ans);
    minStack.pop();
    ans = minStack.getMin();
    assertEquals(-1024, ans);
    minStack.pop();
    ans = minStack.getMin();
    assertEquals(512, ans);
  }
}
