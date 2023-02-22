package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import dev.ianbunag.java_kata.lib.TreeNode;

/**
 * Challenge tests.
 */
public class N14SubtreeOfAnotherTreeTest {
  @Test
  public void it_should_return_true_if_it_is_sub_tree() throws Exception {
    var nodeA1 = new TreeNode(1);
    var nodeA2 = new TreeNode(2);
    var nodeA3 = new TreeNode(3);
    var nodeA4 = new TreeNode(4);
    var nodeA5 = new TreeNode(5);
    nodeA3.left = nodeA4;
    nodeA3.right = nodeA5;
    nodeA4.left = nodeA1;
    nodeA4.right = nodeA2;

    var nodeB1 = new TreeNode(1);
    var nodeB2 = new TreeNode(2);
    var nodeB4 = new TreeNode(4);
    nodeB4.left = nodeB1;
    nodeB4.right = nodeB2;

    var solution = new N14SubtreeOfAnotherTree();

    assertEquals(true, solution.isSubtree(nodeA3, nodeB4));
  }

  @Test
  public void it_should_return_true_if_not_a_sub_tree() throws Exception {
    var nodeA0 = new TreeNode(0);
    var nodeA1 = new TreeNode(1);
    var nodeA2 = new TreeNode(2);
    var nodeA3 = new TreeNode(3);
    var nodeA4 = new TreeNode(4);
    var nodeA5 = new TreeNode(5);
    nodeA3.left = nodeA4;
    nodeA3.right = nodeA5;
    nodeA4.left = nodeA1;
    nodeA4.right = nodeA2;
    nodeA2.left = nodeA0;

    var nodeB1 = new TreeNode(1);
    var nodeB2 = new TreeNode(2);
    var nodeB4 = new TreeNode(4);
    nodeB4.left = nodeB1;
    nodeB4.right = nodeB2;

    var solution = new N14SubtreeOfAnotherTree();

    assertEquals(false, solution.isSubtree(nodeA3, nodeB4));
  }

  @Test
  public void it_should_return_true_for_imbalanced_sub_tree() throws Exception {
    var nodeA1 = new TreeNode(1);
    var nodeA2 = new TreeNode(1);
    var nodeA3 = new TreeNode(1);
    var nodeA4 = new TreeNode(1);
    var nodeA5 = new TreeNode(1);
    var nodeA6 = new TreeNode(1);
    var nodeA7 = new TreeNode(1);
    var nodeA8 = new TreeNode(1);
    var nodeA9 = new TreeNode(1);
    var nodeA10 = new TreeNode(1);
    var nodeA11 = new TreeNode(1);
    var nodeA12 = new TreeNode(2);
    nodeA1.right = nodeA2;
    nodeA2.right = nodeA3;
    nodeA3.right = nodeA4;
    nodeA4.right = nodeA5;
    nodeA5.right = nodeA6;
    nodeA6.right = nodeA7;
    nodeA7.right = nodeA8;
    nodeA8.right = nodeA9;
    nodeA9.right = nodeA10;
    nodeA10.right = nodeA11;
    nodeA11.left = nodeA12;

    var nodeB1 = new TreeNode(1);
    var nodeB2 = new TreeNode(1);
    var nodeB3 = new TreeNode(1);
    var nodeB4 = new TreeNode(1);
    var nodeB5 = new TreeNode(1);
    var nodeB6 = new TreeNode(1);
    var nodeB7 = new TreeNode(2);
    nodeB1.right = nodeB2;
    nodeB2.right = nodeB3;
    nodeB3.right = nodeB4;
    nodeB4.right = nodeB5;
    nodeB5.right = nodeB6;
    nodeB6.left = nodeB7;

    var solution = new N14SubtreeOfAnotherTree();

    assertEquals(true, solution.isSubtree(nodeA1, nodeB1));
  }
}
