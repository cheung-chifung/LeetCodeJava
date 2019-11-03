package com.chifungcheung.leetcode.solutions.s232;

import java.util.Stack;

/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start
class MyQueue {
  Stack<Integer> stackPop = new Stack<>();
  Stack<Integer> stackPush = new Stack<>();

  /** Initialize your data structure here. */
  public MyQueue() {
  }

  /** Push element x to the back of queue. */
  public void push(int x) {
    readyForPush();
    stackPush.push(x);
  }

  /** Removes the element from in front of queue and returns that element. */
  public int pop() {
    readyForPop();
    return stackPop.pop();
  }

  /** Get the front element. */
  public int peek() {
    readyForPop();
    return stackPop.peek();
  }

  /** Returns whether the queue is empty. */
  public boolean empty() {
    return stackPop.isEmpty() && stackPush.isEmpty();
  }

  private void readyForPop() {
    while (!stackPush.isEmpty()) {
      stackPop.push(stackPush.pop());
    }
  }

  private void readyForPush() {
    while (!stackPop.isEmpty()) {
      stackPush.push(stackPop.pop());
    }
  }
}

// @lc code=end
