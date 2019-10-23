package com.chifungcheung.leetcode.solutions.s68;

import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=68 lang=java
 *
 * [68] Text Justification
 */

// @lc code=start
class Solution {
  public List<String> fullJustify(String[] words, int maxWidth) {
    List<String> ans = new ArrayList<>();

    int acc = maxWidth;
    List<List<String>> lines = new ArrayList<>();
    List<String> line = new ArrayList<>();

    for (String w : words) {
      int wLen = w.length();
      if (maxWidth - acc >= wLen + 1) {
        acc += wLen + 1;
        line.add(w);
      } else {
        line = new ArrayList<>();
        line.add(w);
        lines.add(line);
        acc = wLen;
      }
    }
    for (int i = 0; i < lines.size(); i++) {
      ans.add(this.justify(lines.get(i), maxWidth, i == lines.size() - 1));
    }
    return ans;
  }

  private String justify(List<String> words, int maxWidth, boolean isLast) {
    StringBuilder sb = new StringBuilder();
    int wc = words.size();
    int spaces = maxWidth - words.get(0).length();
    sb.append(words.get(0));

    for (int i = 1; i < wc; i++) {
      spaces -= words.get(i).length();
    }
    int acc = 0;
    for (int i = 1; i < wc; i++) {
      int sp = isLast ? 1 : (spaces / (wc - 1) + (i <= spaces % (wc - 1) ? 1 : 0));
      acc += sp;
      for (int j = 0; j < sp; j++) {
        sb.append(' ');
      }
      sb.append(words.get(i));
    }
    spaces -= acc;
    for (int i = 0; i < spaces; i++) {
      sb.append(' ');
    }
    return sb.toString();
  }
}
// @lc code=end
