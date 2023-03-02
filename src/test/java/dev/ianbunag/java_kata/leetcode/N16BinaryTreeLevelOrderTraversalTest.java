package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import dev.ianbunag.java_kata.lib.TreeNode;

/**
 * Challenge tests.
 */
public class N16BinaryTreeLevelOrderTraversalTest {
  @Test
  public void it_should_order_nested_tree() throws Exception {
    var expected = new ArrayList<List<Integer>>();
    expected.add(Arrays.asList(new Integer[]{3}));
    expected.add(Arrays.asList(new Integer[]{9, 20}));
    expected.add(Arrays.asList(new Integer[]{15, 7}));

    var node3 = new TreeNode(3);
    var node9 = new TreeNode(9);
    var node20 = new TreeNode(20);
    var node15 = new TreeNode(15);
    var node7 = new TreeNode(7);
    node3.left = node9;
    node3.right = node20;
    node20.left = node15;
    node20.right = node7;

    var solution = new N16BinaryTreeLevelOrderTraversal();

    assertEquals(expected, solution.levelOrder(node3));
  }

  @Test
  public void it_should_order_single_tree() throws Exception {
    var expected = new ArrayList<List<Integer>>();
    expected.add(Arrays.asList(new Integer[]{1}));

    var solution = new N16BinaryTreeLevelOrderTraversal();

    assertEquals(expected, solution.levelOrder(new TreeNode(1)));
  }

  @Test
  public void it_should_order_empty_tree() throws Exception {
    var solution = new N16BinaryTreeLevelOrderTraversal();

    assertEquals(Arrays.asList(new Integer[]{}), solution.levelOrder(null));
  }
}
