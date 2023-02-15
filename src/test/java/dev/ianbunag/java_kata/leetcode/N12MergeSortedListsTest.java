package dev.ianbunag.java_kata.leetcode;

import dev.ianbunag.java_kata.lib.ListNode;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Challenge tests.
 */
public class N12MergeSortedListsTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N12MergeSortedLists();
    var nodeLists = new ListNode[]{
        null,
        ListNode.fromList(new int[]{1, 4, 5}),
        null,
        ListNode.fromList(new int[]{1, 3, 4}),
        null,
        ListNode.fromList(new int[]{2, 6}),
        null,
    };

    assertArrayEquals(solution.mergeKLists(nodeLists).toList(), new int[]{1, 1, 2, 3, 4, 4, 5, 6});
    assertEquals(null, solution.mergeKLists(new ListNode[]{}));
    assertEquals(null, solution.mergeKLists(new ListNode[]{null}));
  }
}
