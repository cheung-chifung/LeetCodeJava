package com.chifungcheung.leetcode.solutions.s942;

/*
 * @lc app=leetcode id=942 lang=java
 *
 * [942] DI String Match
 */

// @lc code=start
class Solution {
  public int[] diStringMatch(String S) {
    int n = S.length();
    int dCount = 0, iCount = 0;
    for (int i = 0; i < n; i++) {
      char ch = S.charAt(i);
      if (ch == 'I') {
        iCount++;
      } else if (ch == 'D') {
        dCount++;
      }
    }
    int[] ans = new int[n + 1];
    int dNum, iNum;
    if (S.charAt(0) == 'I') {
      ans[0] = 0;
      iNum = n - iCount + 1;
      dNum = dCount;
    } else {
      ans[0] = n;
      dNum = dCount - 1;
      iNum = n - iCount;
    }
    for (int i = 0; i < n; i++) {
      char ch = S.charAt(i);
      if (ch == 'I') {
        ans[i + 1] = iNum;
        iNum++;
      } else if (ch == 'D') {
        ans[i + 1] = dNum;
        dNum--;
      }
    }
    return ans;
  }
}
// @lc code=end
