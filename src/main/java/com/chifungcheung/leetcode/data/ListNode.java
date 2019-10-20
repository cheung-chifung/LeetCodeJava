package com.chifungcheung.leetcode.data;

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }

  public static ListNode fromArray(int[] vars) {
    if (vars.length == 0) {
      return null;
    }
    ListNode dummy = new ListNode(Integer.MIN_VALUE);
    ListNode curr = dummy;
    for (int i = 0; i < vars.length; i++) {
      curr.next = new ListNode(vars[i]);
      curr = curr.next;
    }
    return dummy.next;
  }
}