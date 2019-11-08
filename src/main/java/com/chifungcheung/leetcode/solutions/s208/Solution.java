package com.chifungcheung.leetcode.solutions.s208;

/*
 * @lc app=leetcode id=208 lang=java
 *
 * [208] Implement Trie (Prefix Tree)
 */

// @lc code=start
class Trie {
  class Node {
    Node[] children = new Node[26];
    boolean isWord = false;
  }

  Node head;

  /** Initialize your data structure here. */
  public Trie() {
    this.head = new Node();
  }

  /** Inserts a word into the trie. */
  public void insert(String word) {
    Node cur = this.head;
    for (char ch : word.toCharArray()) {
      int order = ch - 'a';
      if (cur.children[order] == null) {
        cur.children[order] = new Node();
      }
      cur = cur.children[order];
    }
    cur.isWord = true;
  }

  /** Returns if the word is in the trie. */
  public boolean search(String word) {
    Node cur = this.head;
    for (char ch : word.toCharArray()) {
      int order = ch - 'a';
      if (cur.children[order] == null) {
        return false;
      }
      cur = cur.children[order];
    }
    return cur.isWord;
  }

  /**
   * Returns if there is any word in the trie that starts with the given prefix.
   */
  public boolean startsWith(String prefix) {
    Node cur = this.head;
    for (char ch : prefix.toCharArray()) {
      int order = ch - 'a';
      if (cur.children[order] == null) {
        return false;
      }
      cur = cur.children[order];
    }
    return cur != null;
  }
}

// @lc code=end
