package com.chifungcheung.leetcode.solutions.s150;

import java.util.Stack;

/*
 * @lc app=leetcode id=150 lang=java
 *
 * [150] Evaluate Reverse Polish Notation
 */

// @lc code=start
class Solution {
  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    for (String tok : tokens) {
      if (tok.equals("+")) {
        int b = stack.pop(), a = stack.pop();
        stack.push(a + b);
      } else if (tok.equals("-")) {
        int b = stack.pop(), a = stack.pop();
        stack.push(a - b);
      } else if (tok.equals("*")) {
        int b = stack.pop(), a = stack.pop();
        stack.push(a * b);
      } else if (tok.equals("/")) {
        int b = stack.pop(), a = stack.pop();
        stack.push(a / b);
      } else {
        stack.push(Integer.parseInt(tok));
      }
    }
    return stack.pop();
  }
}
// @lc code=end
