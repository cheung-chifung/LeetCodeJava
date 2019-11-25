package com.chifungcheung.leetcode.solutions.s284;

import java.util.Iterator;

/*
 * @lc app=leetcode id=284 lang=java
 *
 * [284] Peeking Iterator
 */

// @lc code=start
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {

  private Integer next;
  private Iterator<Integer> iter;

  public PeekingIterator(Iterator<Integer> iterator) {
    iter = iterator;
    next = null;
    refresh();
  }

  private void refresh() {
    if (iter.hasNext()) {
      next = iter.next();
    } else {
      next = null;
    }
  }

  // Returns the next element in the iteration without advancing the iterator.
  public Integer peek() {
    return next;
  }

  // hasNext() and next() should behave the same as in the Iterator interface.
  // Override them if needed.
  @Override
  public Integer next() {
    Integer lastNext = next;
    refresh();
    return lastNext;
  }

  @Override
  public boolean hasNext() {
    return next != null;
  }
}
// @lc code=end
