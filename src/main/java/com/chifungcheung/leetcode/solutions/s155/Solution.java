package com.chifungcheung.leetcode.solutions.s155;

import java.util.Stack;

/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 */

// @lc code=start
class MinStack {
  Stack<Integer> stack = new Stack<>();
  Stack<Integer> min = new Stack<>();

  public void push(int x) {
    stack.push(x);
    if (min.isEmpty() || x <= min.peek()) {
      min.push(x);
    }
  }

  public void pop() {
    if (stack.pop().equals(min.peek())) {
      min.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return min.peek();
  }
}

// @lc code=end

