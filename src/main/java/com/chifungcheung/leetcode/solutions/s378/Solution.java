package com.chifungcheung.leetcode.solutions.s378;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode id=378 lang=java
 *
 * [378] Kth Smallest Element in a Sorted Matrix
 */

// @lc code=start
class Solution {
  class Selection {
    int row;
    int start;
    int length;
  }

  public int kthSmallest(int[][] matrix, int k) {
    int n = matrix.length;
    Map<Integer, Selection> sels = new HashMap<>();
    for (int i = 0; i < n; i++) {
      Selection sel = new Selection();
      sel.row = i;
      sel.start = 0;
      sel.length = n;
      sels.put(i, sel);
    }
    return kthSmallestFromMatrix(matrix, k, sels);
  }

  private int kthSmallestFromMatrix(int[][] matrix, int k, Map<Integer, Selection> sels) {
    int n = sels.size();
    if (sels.size() == 1) {
      Selection sel = sels.values().iterator().next();
      return matrix[sel.row][sel.start + k - 1];
    }

    int min = Integer.MAX_VALUE;
    int minP = Integer.MIN_VALUE;
    Selection minSel = null;
    if (k < n) {
      List<Selection> sorted = sels.values().stream()
          .sorted((o1, o2) -> matrix[o1.row][o1.start] - matrix[o2.row][o2.start]).collect(Collectors.toList());
      if (k == 1) {
        minSel = sorted.get(0);
        if (minSel != null) {
          return matrix[minSel.row][minSel.start];
        }
        return -1;
      }
      minSel = sorted.get(0);
      minP = 1;
    } else {
      for (Selection sel : sels.values()) {
        int p = Integer.min(sel.length, k / n);
        int val = matrix[sel.row][sel.start + p - 1];
        if (val < min) {
          min = val;
          minSel = sel;
          minP = p;
        }
      }
    }
    minSel.start += minP;
    minSel.length -= minP;
    if (minSel.length == 0) {
      sels.remove(minSel.row);
    } else {
      sels.put(minSel.row, minSel);
    }
    return kthSmallestFromMatrix(matrix, k - minP, sels);
  }
}
// @lc code=end
