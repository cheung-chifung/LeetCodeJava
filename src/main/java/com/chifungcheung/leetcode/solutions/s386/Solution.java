package com.chifungcheung.leetcode.solutions.s386;

import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=386 lang=java
 *
 * [386] Lexicographical Numbers
 */

// @lc code=start
class Solution {
  public List<Integer> lexicalOrder(int n) {
    List<Integer> ans = new LinkedList<>();
    lexicalOrderWithBase(n, 0, ans);
    return ans;
  }

  private void lexicalOrderWithBase(int n, int base, List<Integer> ans) {
    for (int i = 0; i <= 9; i++) {
      int num = base + i;
      if (num > 0 && num <= n) {
        ans.add(num);
        lexicalOrderWithBase(n, num * 10, ans);
      }
    }
  }
}
// @lc code=end
