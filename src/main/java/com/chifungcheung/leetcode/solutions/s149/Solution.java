package com.chifungcheung.leetcode.solutions.s149;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=149 lang=java
 *
 * [149] Max Points on a Line
 */

// @lc code=start
class Solution {
  public int maxPoints(int[][] points) {
    if (points.length <= 2) {
      return points.length;
    }
    int maxLen = 1;
    for (int i = 0; i < points.length; i++) {
      Map<String, Integer> d = new HashMap<String, Integer>();
      int overlap = 0;
      int lineMax = 0;
      for (int j = i + 1; j < points.length; j++) {
        int dx = points[i][0] - points[j][0];
        int dy = points[i][1] - points[j][1];
        if (dx == 0 && dy == 0) {
          overlap++;
          continue;
        }
        int gcd = findGCD(dx, dy);
        dx /= gcd;
        dy /= gcd;
        String slope = String.format("%d_%d", dx, dy);
        int count = d.getOrDefault(slope, 0);
        count++;
        lineMax = Math.max(lineMax, count);
        d.put(slope, count);
      }
      maxLen = Math.max(maxLen, lineMax + overlap + 1);
    }
    return maxLen;
  }

  private int findGCD(int a, int b) {
    if (b == 0) {
      return a;
    }
    return findGCD(b, a % b);
  }
}
// @lc code=end

