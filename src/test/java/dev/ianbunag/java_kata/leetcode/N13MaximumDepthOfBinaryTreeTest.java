package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.ianbunag.java_kata.lib.TreeNode;
import org.junit.Test;

/**
 * Challenge tests.
 */
public class N13MaximumDepthOfBinaryTreeTest {
  @Test
  public void testChallenge() throws Exception {
    var node3 = new TreeNode(3);
    var node9 = new TreeNode(3);
    var node20 = new TreeNode(3);
    var node15 = new TreeNode(3);
    var node7 = new TreeNode(3);
    node20.right = node7;
    node20.left = node15;
    node3.left = node9;
    node3.right = node20;

    var solution = new N13MaximumDepthOfBinaryTree();

    assertEquals(3, solution.maxDepth(node3));

    var node1 = new TreeNode(1);
    var node2 = new TreeNode(2);
    node1.right = node2;

    assertEquals(2, solution.maxDepth(node1));
  }
}
