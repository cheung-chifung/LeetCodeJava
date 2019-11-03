package com.chifungcheung.leetcode.solutions.s223;

/*
 * @lc app=leetcode id=223 lang=java
 *
 * [223] Rectangle Area
 */

// @lc code=start
class Solution {
  public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    long w1 = C - A, h1 = D - B;
    long w2 = G - E, h2 = H - F;
    long a1 = w1 * h1, a2 = w2 * h2;

    long il = Math.max(A, E);
    long ib = Math.max(B, F);
    long ir = Math.min(C, G);
    long it = Math.min(D, H);
    long ia = Math.max(it - ib, 0) * Math.max(ir - il, 0);
    return (int) (a1 + a2 - ia);
  }
}
// @lc code=end
