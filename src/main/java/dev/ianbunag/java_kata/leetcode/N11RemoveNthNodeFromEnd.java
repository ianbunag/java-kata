package dev.ianbunag.java_kata.leetcode;

import dev.ianbunag.java_kata.lib.ListNode;

/**
 * Challenge solution.
 */
public class N11RemoveNthNodeFromEnd {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return challenge answer.
    */
  public ListNode removeNthFromEnd(ListNode head, int index) {
    final ListNode start = new ListNode(-1, head);
    var left = start;
    var right = head;

    for (; index > 0; index -= 1) {
      right = right.next;
    }

    while (right != null) {
      right = right.next;
      left = left.next;
    }

    left.next = left.next.next;

    return start.next;
  }
}
