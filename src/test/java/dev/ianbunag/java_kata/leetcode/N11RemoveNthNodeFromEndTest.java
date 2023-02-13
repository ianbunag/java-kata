package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.ianbunag.java_kata.lib.ListNode;
import org.junit.Test;


/**
 * Challenge tests.
 */
public class N11RemoveNthNodeFromEndTest {
  @Test
  public void it_should_remove_nth_node_from_end() throws Exception {
    var solution = new N11RemoveNthNodeFromEnd();
    var list = ListNode.fromList(new int[]{1, 2, 3});
    var result = solution.removeNthFromEnd(list, 2);

    assertEquals(1, result.val);
    assertEquals(3, result.next.val);
    assertEquals(null, result.next.next);
  }

  @Test
  public void it_should_remove_first_node() throws Exception {
    var solution = new N11RemoveNthNodeFromEnd();
    var list = ListNode.fromList(new int[]{1, 2});
    var result = solution.removeNthFromEnd(list, 2);

    assertEquals(2, result.val);
    assertEquals(null, result.next);
  }

  @Test
  public void it_should_remove_remaining_node() throws Exception {
    var solution = new N11RemoveNthNodeFromEnd();
    var list = ListNode.fromList(new int[]{1});
    var result = solution.removeNthFromEnd(list, 1);

    assertEquals(null, result);
  }
}
