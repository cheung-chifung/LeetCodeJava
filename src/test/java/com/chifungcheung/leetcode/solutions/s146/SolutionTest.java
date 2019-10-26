package com.chifungcheung.leetcode.solutions.s146;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution() {
    LRUCache cache = new LRUCache(2);

    int ans;
    cache.put(1, 1);
    cache.put(2, 2);
    ans = cache.get(1); // returns 1
    assertEquals(1, ans);
    cache.put(3, 3); // evicts key 2
    ans = cache.get(2); // returns -1 (not found)
    assertEquals(-1, ans);
    cache.put(4, 4); // evicts key 1
    ans = cache.get(1); // returns -1 (not found)
    assertEquals(-1, ans);
    ans = cache.get(3); // returns 3
    assertEquals(3, ans);
    ans = cache.get(4); // returns 4
    assertEquals(4, ans);
  }
}
