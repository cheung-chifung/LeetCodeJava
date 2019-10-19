package com.chifungcheung.leetcode.solutions.s204;

/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        if (n == 1) {
            return 0;
        }
        boolean[] d = new boolean[n];
        for (int i = 0; i < n; i++) {
            d[i] = false;
        }

        for (int f = 2; f <= Math.ceil(Math.sqrt(n)); f++) {
            int dg = f + f;
            while (dg - 1 < n) {
                d[dg - 1] = true;
                dg += f;
            }
        }
        int ans = 0;
        for (int i = 1; i < d.length - 1; i++) {
            if (!d[i]) {
                ans += 1;
            }
        }
        return ans;
    }
}

// @lc code=end