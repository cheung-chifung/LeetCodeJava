package com.chifungcheung.leetcode.solutions.s139;

import java.util.List;

/*
 * @lc app=leetcode id=139 lang=java
 *
 * [139] Word Break
 */

// @lc code=start
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] d = new boolean[s.length() + 1];
        d[0] = true;
        for (int i = 1; i < d.length; i++) {
            d[i] = false;
        }
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < wordDict.size(); j++) {
                String word = wordDict.get(j);
                if (i + word.length() < d.length && s.substring(i, i + word.length()).equals(word)) {
                    d[i + word.length()] = d[i] || d[i + word.length()];
                }
            }
        }
        return d[s.length()];
    }
}
// @lc code=end
