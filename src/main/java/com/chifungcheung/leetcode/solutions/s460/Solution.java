package com.chifungcheung.leetcode.solutions.s460;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=460 lang=java
 *
 * [460] LFU Cache
 */

// @lc code=start
class LFUCache {
  class Pair implements Comparable<Pair> {
    int key;
    int value;
    int frequency;
    int timestamp;

    Pair(int key, int value, int frequency, int timestamp) {
      this.key = key;
      this.value = value;
      this.frequency = frequency;
      this.timestamp = timestamp;
    }

    public int compareTo(Pair other) {
      if (this.frequency != other.frequency) {
        return this.frequency - other.frequency;
      }
      return this.timestamp - other.timestamp;
    }
  }

  int capacity;
  int latestTimestamp;
  Map<Integer, Pair> map;
  PriorityQueue<Pair> queue;

  public LFUCache(int capacity) {
    this.capacity = capacity;
    this.map = new HashMap<>();
    this.queue = new PriorityQueue<Pair>();
    this.latestTimestamp = 1;
  }

  public int get(int key) {
    if (capacity > 0 && map.containsKey(key)) {
      Pair pair = map.get(key);
      update(pair);
      return pair.value;
    }
    return -1;
  }

  public void put(int key, int value) {
    Pair pair;
    if (map.containsKey(key)) {
      pair = map.get(key);
      pair.value = value;
      update(pair);
    } else {
      pair = new Pair(key, value, 0, ++latestTimestamp);
      insert(pair);
    }
  }

  private void update(Pair old) {
    queue.remove(old);
    Pair newPair = new Pair(old.key, old.value, old.frequency + 1, ++latestTimestamp);
    insert(newPair);
  }

  private void insert(Pair newPair) {
    if (capacity > 0) {
      if (queue.size() == capacity) {
        Pair eldest = queue.poll();
        map.remove(eldest.key);
      }
      map.put(newPair.key, newPair);
      queue.offer(newPair);
    }
  }
}

// @lc code=end
