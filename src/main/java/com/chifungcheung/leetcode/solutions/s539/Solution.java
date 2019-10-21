package com.chifungcheung.leetcode.solutions.s539;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode id=539 lang=java
 *
 * [539] Minimum Time Difference
 */

// @lc code=start
class Solution {
  public int findMinDifference(List<String> timePoints) {
    if (timePoints.size() <= 1) {
      return 0;
    }
    List<Integer> d = new ArrayList<>(2 * timePoints.size());
    final int maxMinute = 24 * 60;
    for (int i = 0; i < timePoints.size(); i++) {
      int minute = this.timeToMinute(timePoints.get(i));
      d.add(minute);
      d.add(minute + maxMinute);
    }
    Collections.sort(d);

    int ans = Integer.MAX_VALUE;
    for (int i = 0; i < d.size() - 1; i++) {
      ans = Math.min(ans, d.get(i + 1) - d.get(i));
    }
    return ans;
  }

  private int timeToMinute(String time) {
    int hour = Integer.parseInt(time.substring(0, 2));
    int minute = Integer.parseInt(time.substring(3, 5));
    return hour * 60 + minute;
  }
}
// @lc code=end
