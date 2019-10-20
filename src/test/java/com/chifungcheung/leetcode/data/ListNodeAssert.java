package com.chifungcheung.leetcode.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ListNodeAssert {
  public static void assertListNodeEquals(int[] expected, ListNode actual) {
    ListNode head = actual;
    for (int i = 0; i < expected.length; i++) {
      assertNotNull(head);
      assertEquals(expected[i], head.val);
      head = head.next;
    }
  }
}