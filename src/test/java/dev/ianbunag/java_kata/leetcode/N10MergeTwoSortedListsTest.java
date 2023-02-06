package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.ianbunag.java_kata.lib.ListNode;
import org.junit.Test;

/**
 * Challenge tests.
 */
public class N10MergeTwoSortedListsTest {
  @Test
  public void it_should_merge_sorted_lists() throws Exception {
    var solution = new N10MergeTwoSortedLists();
    var list1 = ListNode.fromList(new int[]{1, 2, 4});
    var list2 = ListNode.fromList(new int[]{1, 3, 4});
    var merged = solution.mergeTwoLists(list1, list2);

    assertEquals(merged.val, 1);
    assertEquals(merged.next.val, 1);
    assertEquals(merged.next.next.val, 2);
    assertEquals(merged.next.next.next.val, 3);
    assertEquals(merged.next.next.next.next.val, 4);
    assertEquals(merged.next.next.next.next.next.val, 4);
    assertEquals(merged.next.next.next.next.next.next, null);
  }

  @Test
  public void it_should_merge_empty_lists() throws Exception {
    var solution = new N10MergeTwoSortedLists();
    var merged = solution.mergeTwoLists(null, null);

    assertEquals(merged, null);
  }

  @Test
  public void it_should_merge_list_with_empty_list() throws Exception {
    var solution = new N10MergeTwoSortedLists();
    var merged = solution.mergeTwoLists(new ListNode(0), null);

    assertEquals(merged.val, 0);
    assertEquals(merged.next, null);
  }

  @Test
  public void it_should_merge_empty_list_with_list() throws Exception {
    var solution = new N10MergeTwoSortedLists();
    var merged = solution.mergeTwoLists(null, new ListNode(0));

    assertEquals(merged.val, 0);
    assertEquals(merged.next, null);
  }
}
