package dev.ianbunag.java_kata.leetcode;

import dev.ianbunag.java_kata.lib.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Challenge solution.
 */
public class N16BinaryTreeLevelOrderTraversal {
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
  public List<List<Integer>> levelOrder(TreeNode root) {
    var levels = new ArrayList<List<TreeNode>>();
    levels.add(Arrays.asList(new TreeNode[]{root}));

    for (var level = 0; levels.get(level).size() > 0; level += 1) {
      var levelNodes = new ArrayList<TreeNode>();

      for (TreeNode node : levels.get(level)) {
        if (node != null) {
          levelNodes.add(node.left);
          levelNodes.add(node.right);
        }
      }

      levels.add(levelNodes);
    }

    return levels
      .stream()
      .map(nodes -> nodes
        .stream()
        .filter(node -> node != null)
        .map(node -> node.val)
        .collect(Collectors.toList())
      )
      .filter(nodes -> nodes.size() > 0)
      .collect(Collectors.toList());
  }
}
