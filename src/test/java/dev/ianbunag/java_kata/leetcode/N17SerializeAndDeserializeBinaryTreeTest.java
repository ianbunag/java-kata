package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dev.ianbunag.java_kata.lib.TreeNode;
import org.junit.Test;

/**
 * Challenge tests.
 */
public class N17SerializeAndDeserializeBinaryTreeTest {
  @Test
  public void it_should_serialize_and_deserialize_null_tree() throws Exception {
    var solution = new N17SerializeAndDeserializeBinaryTree();
    var serialized = solution.serialize(null);
    var deserialized = solution.deserialize(serialized);

    assertEquals("_1", serialized);
    assertEquals(null, deserialized);
  }

  @Test
  public void it_should_serialize_and_deserialize_single_tree() throws Exception {
    var solution = new N17SerializeAndDeserializeBinaryTree();
    var serialized = solution.serialize(new TreeNode(1));
    var deserialized = solution.deserialize(serialized);

    assertEquals("+1", serialized);
    assertEquals(1, deserialized.val);
  }

  @Test
  public void it_should_serialize_and_deserialize_simple_tree() throws Exception {
    var node1 = new TreeNode(1);
    var node2 = new TreeNode(2);
    var node3 = new TreeNode(3);
    node1.left = node2;
    node1.right = node3;
    var solution = new N17SerializeAndDeserializeBinaryTree();
    var serialized = solution.serialize(node1);
    var deserialized = solution.deserialize(serialized);

    assertEquals("+1+2+3", serialized);
    assertEquals(1, deserialized.val);
    assertEquals(2, deserialized.left.val);
    assertEquals(3, deserialized.right.val);
  }

  @Test
  public void it_should_serialize_and_deserialize_tree_with_hex_values() throws Exception {
    var node0 = new TreeNode(0);
    var nodeN15 = new TreeNode(-15);
    var node1000 = new TreeNode(1000);
    node0.left = nodeN15;
    node0.right = node1000;
    var solution = new N17SerializeAndDeserializeBinaryTree();
    var serialized = solution.serialize(node0);
    var deserialized = solution.deserialize(serialized);

    assertEquals("+0-f+rs", serialized);
    assertEquals(0, deserialized.val);
    assertEquals(-15, deserialized.left.val);
    assertEquals(1000, deserialized.right.val);
  }

  @Test
  public void it_should_serialize_and_deserialize_tree_with_negative_values() throws Exception {
    var node0 = new TreeNode(0);
    var nodeN1 = new TreeNode(-1);
    var node1 = new TreeNode(1);
    node0.left = nodeN1;
    node0.right = node1;
    var solution = new N17SerializeAndDeserializeBinaryTree();
    var serialized = solution.serialize(node0);
    var deserialized = solution.deserialize(serialized);

    assertEquals("+0-1+1", serialized);
    assertEquals(0, deserialized.val);
    assertEquals(-1, deserialized.left.val);
    assertEquals(1, deserialized.right.val);
  }

  @Test
  public void it_should_serialize_and_deserialize_tree_with_small_edge_gaps() throws Exception {
    var node3 = new TreeNode(3);
    var node1 = new TreeNode(1);
    var node4 = new TreeNode(4);
    var node2 = new TreeNode(2);
    var node5 = new TreeNode(5);
    node3.left = node1;
    node3.right = node4;
    node1.right = node2;
    node4.right = node5;
    var solution = new N17SerializeAndDeserializeBinaryTree();
    var serialized = solution.serialize(node3);
    var deserialized = solution.deserialize(serialized);

    assertEquals("+3+1+4_1+2_1+5", serialized);
    assertEquals(3, deserialized.val);
    assertEquals(1, deserialized.left.val);
    assertEquals(4, deserialized.right.val);
    assertEquals(2, deserialized.left.right.val);
    assertEquals(5, deserialized.right.right.val);
  }

  @Test
  public void it_should_serialize_and_deserialize_tree_with_large_edge_gaps() throws Exception {
    var node3 = new TreeNode(3);
    var node2 = new TreeNode(2);
    var node4 = new TreeNode(4);
    var node1 = new TreeNode(1);
    var node5 = new TreeNode(5);
    node3.left = node2;
    node3.right = node4;
    node2.left = node1;
    node4.right = node5;
    var solution = new N17SerializeAndDeserializeBinaryTree();
    var serialized = solution.serialize(node3);
    var deserialized = solution.deserialize(serialized);

    assertEquals("+3+2+4+1_2+5", serialized);
    assertEquals(3, deserialized.val);
    assertEquals(2, deserialized.left.val);
    assertEquals(4, deserialized.right.val);
    assertEquals(1, deserialized.left.left.val);
    assertEquals(5, deserialized.right.right.val);
  }

  @Test
  public void it_should_compress_tree() throws Exception {
    var node1 = new TreeNode(1);
    var node2 = new TreeNode(2);
    var node3 = new TreeNode(3);
    var node4 = new TreeNode(4);
    var node5 = new TreeNode(5);
    var node6 = new TreeNode(6);
    var node7 = new TreeNode(7);
    node4.left = node3;
    node3.left = node2;
    node2.left = node1;
    node4.right = node5;
    node5.right = node6;
    node6.right = node7;
    var solution = new N17SerializeAndDeserializeBinaryTree();
    var serialized = solution.serialize(node4);
    var deserialized = solution.deserialize(serialized);

    assertEquals("+4+3+5+2_2+6+1_2+7", serialized);
    assertEquals(serialized, solution.serialize(deserialized));
  }
}
