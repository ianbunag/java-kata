package dev.ianbunag.java_kata.leetcode;

import dev.ianbunag.java_kata.lib.ListNode;

/**
 * Challenge solution.
 */
public class N10MergeTwoSortedLists {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(log n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    var head = new ListNode();
    var tail = head;

    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        tail.next = list1;
        list1 = list1.next;
      } else {
        tail.next = list2;
        list2 = list2.next;
      }

      tail = tail.next;
    }

    if (list1 == null) {
      tail.next = list2;
    } else {
      tail.next = list1;
    }

    return head.next;
  }
}
