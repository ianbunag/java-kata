package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N24CloneGraphTest {
  @Test
  public void it_should_clone_empty_node() throws Exception {
    var solution = new N24CloneGraph();

    assertEquals(null, solution.cloneGraph(null));
  }

  @Test
  public void it_should_clone_single_node() throws Exception {
    var solution = new N24CloneGraph();
    var root = new Node(0);
    var copy = solution.cloneGraph(root);

    assertNotSame(root, copy);
    assertEquals(root.val, copy.val);
  }

  @Test
  public void it_should_clone_two_nodes() throws Exception {
    var solution = new N24CloneGraph();
    var first = new Node(0);
    var second = new Node(1);

    first.neighbors.add(second);
    second.neighbors.add(first);

    var firstCopy = solution.cloneGraph(first);
    var secondCopy = firstCopy.neighbors.get(0);

    assertNotSame(first, firstCopy);
    assertNotSame(second, secondCopy);
    assertEquals(first.val, firstCopy.val);
    assertEquals(second.val, secondCopy.val);
    assertEquals(second.neighbors.get(0).val, secondCopy.neighbors.get(0).val);
    assertSame(firstCopy, secondCopy.neighbors.get(0));
  }
}
