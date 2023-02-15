package dev.ianbunag.java_kata.leetcode;

import dev.ianbunag.java_kata.lib.ListNode;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Challenge solution.
 */
public class N12MergeSortedLists {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n log n)
    *  <li>Worst time complexity:   O(n log n)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  public ListNode mergeKLists(ListNode[] lists) {
    if (lists.length < 1) {
      return null;
    }

    var mergedLists = new ArrayList<ListNode>(Arrays.asList(lists));

    while (mergedLists.size() > 1) {
      var nextMergedLists = new ArrayList<ListNode>();

      for (int index = 0; index < mergedLists.size(); index += 2) {
        nextMergedLists.add(N12MergeSortedLists.mergeTwoLists(
            mergedLists.get(index),
            index + 1 < mergedLists.size() ? mergedLists.get(index + 1) : null
        ));
      }

      mergedLists = nextMergedLists;
    }

    return mergedLists.get(0);
  }

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
  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
