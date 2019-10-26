package com.chifungcheung.leetcode.solutions.s146;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=146 lang=java
 *
 * [146] LRU Cache
 */

// @lc code=start
class LRUCache {
  private class Node {
    int key, value;
    Node prev, next;

    Node(int k, int v) {
      key = k;
      value = v;
    }

    Node() {
      this(-1, -1);
    }
  }

  private Map<Integer, Node> m;
  private int cap;

  private Node head;
  private Node tail;

  public LRUCache(int capacity) {
    cap = capacity;
    m = new HashMap<>();
    head = new Node();
    tail = new Node();
    head.next = tail;
    tail.prev = head;
  }

  public int get(int key) {
    Node res = m.get(key);
    if (res == null) {
      return -1;
    }
    update(res);
    return res.value;
  }

  public void put(int key, int value) {
    if (m.containsKey(key)) {
      Node v = m.get(key);
      v.value = value;
      update(v);
    } else {
      Node v = new Node(key, value);
      add(v);
      m.put(key, v);

      // evict LRU key
      if (m.size() > this.cap) {
        m.remove(this.tail.prev.key);
        remove(this.tail.prev);
      }
    }
  }

  private void update(Node node) {
    remove(node);
    add(node);
  }

  private void remove(Node node) {
    Node prev = node.prev;
    Node next = node.next;
    prev.next = next;
    next.prev = prev;
  }

  private void add(Node node) {
    Node next = head.next;
    head.next = node;
    node.prev = head;
    node.next = next;
    next.prev = node;
  }
}

// @lc code=end
