package com.chifungcheung.leetcode.solutions.s85;

import java.util.Stack;

/*
 * @lc app=leetcode id=85 lang=java
 *
 * [85] Maximal Rectangle
 */

// @lc code=start
class Solution {
  public int maximalRectangle(char[][] matrix) {
    int rows = matrix.length;
    if (rows == 0) {
      return 0;
    }
    int cols = matrix[0].length;

    int[][] heights = new int[rows][cols];
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        if (matrix[row][col] == '0') {
          heights[row][col] = 0;
        } else {
          heights[row][col] += (row == 0) ? 1 : heights[row - 1][col] + 1;
        }
      }
    }
    int max = Integer.MIN_VALUE;
    for (int row = 0; row < rows; row++) {
      max = Integer.max(max, maxArea(heights[row]));
    }
    return max;
  }

  private int maxArea(int[] heights) {
    Stack<Integer> stack = new Stack<>();
    int max = Integer.MIN_VALUE;
    int i = 0;
    while (i <= heights.length) {
      int h = i == heights.length ? 0 : heights[i];
      if (stack.isEmpty() || h > heights[stack.peek()]) {
        stack.push(i);
        i++;
      } else {
        int t = stack.pop();
        max = Integer.max(max, heights[t] * (stack.isEmpty() ? i : i - stack.peek() - 1));
      }
    }
    return max;
  }
}
// @lc code=end
