package com.chifungcheung.leetcode.solutions.s225;

import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode id=225 lang=java
 *
 * [225] Implement Stack using Queues
 */

// @lc code=start
class MyStack {
  Queue<Integer> queue = new LinkedList<>();

  /** Initialize your data structure here. */
  public MyStack() {
  }

  /** Push element x onto stack. */
  public void push(int x) {
    int n = queue.size();
    queue.add(x);
    while (n-- > 0) {
      queue.add(queue.poll());
    }
  }

  /** Removes the element on top of the stack and returns that element. */
  public int pop() {
    return queue.poll();
  }

  /** Get the top element. */
  public int top() {
    return queue.peek();
  }

  /** Returns whether the stack is empty. */
  public boolean empty() {
    return queue.isEmpty();
  }
}

// @lc code=end
