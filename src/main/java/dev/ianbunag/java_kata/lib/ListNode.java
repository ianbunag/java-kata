package dev.ianbunag.java_kata.lib;

/**
 * ListNode.
 */
public class ListNode {
  public int val;
  public ListNode next;

  public ListNode() {}

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  /**
   * fromList.
   */
  public static ListNode fromList(int[] list) {
    if (list.length < 1) {
      return new ListNode();
    }

    var root = new ListNode(list[0]);
    var tail = root;

    for (int index = 1; index < list.length; index += 1) {
      tail = tail.next = new ListNode(list[index]);
    }

    return root;
  }
}
