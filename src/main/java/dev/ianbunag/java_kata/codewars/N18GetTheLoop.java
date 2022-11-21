package dev.ianbunag.java_kata.codewars;

import java.util.HashMap;

/**
 * Challenge solution.
 */
public class N18GetTheLoop {
  public N18GetTheLoop() { }

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  public int loopSize(Node node) {
    int totalNodes = 0;
    var recordedNodes = new HashMap<Node, Integer>();

    for (; !recordedNodes.containsKey(node); totalNodes += 1) {
      recordedNodes.put(node, totalNodes);
      node = node.getNext();
    }

    return totalNodes - recordedNodes.get(node);
  }
}

final class Node {
  private Node next;

  public static Node createChain(int dangling, int looped) {
    var head = new Node();
    var tail = head;

    for (int index = dangling; index > 0; index -= 1) {
      tail.setNext(new Node());
      tail = tail.getNext();
    }

    var loopHead = tail;

    for (int index = looped - 1; index > 0; index -= 1) {
      tail.setNext(new Node());
      tail = tail.getNext();
    }

    tail.setNext(loopHead);

    return head;
  }

  public Node getNext() {
    return this.next;
  }

  public void setNext(Node node) {
    this.next = node;
  }
}