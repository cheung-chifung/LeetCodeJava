package com.chifungcheung.leetcode.solutions.s341;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=341 lang=java
 *
 * [341] Flatten Nested List Iterator
 */

// @lc code=start
public class NestedIterator implements Iterator<Integer> {

  Stack<NestedInteger> stack;

  public NestedIterator(List<NestedInteger> nestedList) {
    stack = new Stack<>();
    for (int i = nestedList.size() - 1; i >= 0; i--) {
      stack.push(nestedList.get(i));
    }
  }

  @Override
  public Integer next() {
    return stack.pop().getInteger();
  }

  @Override
  public boolean hasNext() {
    while (!stack.isEmpty() && !stack.peek().isInteger()) {
      List<NestedInteger> nums = stack.pop().getList();
      for (int i = nums.size() - 1; i >= 0; i--) {
        stack.push(nums.get(i));
      }
    }
    return !stack.isEmpty();
  }
}

// @lc code=end
