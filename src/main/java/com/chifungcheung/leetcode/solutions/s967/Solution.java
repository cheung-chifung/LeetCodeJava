package com.chifungcheung.leetcode.solutions.s967;

import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=967 lang=java
 *
 * [967] Numbers With Same Consecutive Differences
 */

// @lc code=start
class Solution {
  public int[] numsSameConsecDiff(int N, int K) {
    Set<Integer> ans = new HashSet<>();
    if (N > 0) {
      if (N == 1) {
        ans.add(0);
      }
      for (int i = 1; i <= 9; i++) {
        this.dfs(N - 1, K, ans, i);
      }
    }
    return ans.stream().mapToInt(i -> i).toArray();
  }

  private void dfs(int N, int K, Set<Integer> ans, int num) {
    if (N == 0) {
      ans.add(num);
      return;
    }
    int last = num % 10;
    int n1 = last + K;
    if (n1 >= 0 && n1 <= 9) {
      this.dfs(N - 1, K, ans, num * 10 + n1);
    }
    int n2 = last - K;
    if (n2 >= 0 && n2 <= 9) {
      this.dfs(N - 1, K, ans, num * 10 + n2);
    }
  }
}
// @lc code=end
