package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.ianbunag.java_kata.lib.TreeNode;
import org.junit.Test;

/**
 * Challenge tests.
 */
public class N15LowestCommonAncestorOfTreeTest {
  @Test
  public void it_should_return_node_with_lowest_common_ancestor_children() throws Exception {
    var node0 = new TreeNode(0);
    var node2 = new TreeNode(2);
    var node3 = new TreeNode(3);
    var node4 = new TreeNode(4);
    var node5 = new TreeNode(5);
    var node6 = new TreeNode(6);
    var node7 = new TreeNode(7);
    var node8 = new TreeNode(8);
    var node9 = new TreeNode(9);
    node6.left = node2;
    node6.right = node8;
    node2.left = node0;
    node2.right = node4;
    node4.left = node3;
    node4.right = node5;
    node8.left = node7;
    node8.right = node9;

    var solution = new N15LowestCommonAncestorOfTree();

    assertEquals(node6, solution.lowestCommonAncestor(node6, node2, node8));
  }

  @Test
  public void it_should_return_node_with_itself_as_lowest_common_ancestor() throws Exception {
    var node0 = new TreeNode(0);
    var node2 = new TreeNode(2);
    var node3 = new TreeNode(3);
    var node4 = new TreeNode(4);
    var node5 = new TreeNode(5);
    var node6 = new TreeNode(6);
    var node7 = new TreeNode(7);
    var node8 = new TreeNode(8);
    var node9 = new TreeNode(9);
    node6.left = node2;
    node6.right = node8;
    node2.left = node0;
    node2.right = node4;
    node4.left = node3;
    node4.right = node5;
    node8.left = node7;
    node8.right = node9;

    var solution = new N15LowestCommonAncestorOfTree();

    assertEquals(node2, solution.lowestCommonAncestor(node6, node2, node4));
  }
}
