package com.chifungcheung.leetcode.solutions.s221;

import java.util.Stack;

/*
 * @lc app=leetcode id=221 lang=java
 *
 * [221] Maximal Square
 */

// @lc code=start
class Solution {
  public int maximalSquare(char[][] matrix) {
    int rows = matrix.length;
    if (rows == 0) {
      return 0;
    }
    int cols = matrix[0].length;

    int[][] heights = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] == '0') {
          heights[i][j] = 0;
        } else {
          heights[i][j] = (i == 0) ? 1 : heights[i - 1][j] + 1;
        }
      }
    }

    int max = 0;
    for (int i = 0; i < rows; i++) {
      max = Integer.max(max, maxArea(heights[i]));
    }
    return max;
  }

  private int maxArea(int[] heights) {
    Stack<Integer> stack = new Stack<>();
    int max = 0;
    int i = 0;
    while (i <= heights.length) {
      int h = i == heights.length ? 0 : heights[i];
      if (stack.isEmpty() || h > heights[stack.peek()]) {
        stack.push(i);
        i++;
      } else {
        int t = stack.pop();
        int w = stack.isEmpty() ? i : i - 1 - stack.peek();
        int n = Integer.min(w, heights[t]);
        max = Integer.max(max, n * n);
      }
    }
    return max;
  }
}
// @lc code=end
