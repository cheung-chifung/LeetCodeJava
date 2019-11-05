package com.chifungcheung.leetcode.solutions.s460;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSolution001() {
    LFUCache cache = new LFUCache(2 /* capacity */ );

    cache.put(1, 1);
    cache.put(2, 2);
    assertEquals(1, cache.get(1)); // returns 1
    cache.put(3, 3); // evicts key 2
    assertEquals(-1, cache.get(2)); // returns -1 (not found)
    assertEquals(3, cache.get(3)); // returns 3.
    cache.put(4, 4); // evicts key 1.
    assertEquals(-1, cache.get(1)); // returns -1 (not found)
    assertEquals(3, cache.get(3)); // returns 3
    assertEquals(4, cache.get(4)); // returns 4
  }

  @Test
  public void testSolution002() {
    LFUCache cache = new LFUCache(0 /* capacity */ );

    cache.put(0, 0);
    assertEquals(-1, cache.get(0));
  }

  @Test
  public void testSolution003() {
    LFUCache cache = new LFUCache(3 /* capacity */ );

    cache.put(1, 1);
    cache.put(2, 2);
    cache.put(3, 3);
    cache.put(4, 4);
    assertEquals(4, cache.get(4));
    assertEquals(3, cache.get(3));
    assertEquals(2, cache.get(2));
    assertEquals(-1, cache.get(1));
    cache.put(5, 5);
    assertEquals(-1, cache.get(1));
    assertEquals(2, cache.get(2));
    assertEquals(3, cache.get(3));
    assertEquals(-1, cache.get(4));
    assertEquals(5, cache.get(5));
  }
}
