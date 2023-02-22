package dev.ianbunag.java_kata.leetcode;

import dev.ianbunag.java_kata.lib.TreeNode;

/**
 * Challenge solution.
 */
public class N13MaximumDepthOfBinaryTree {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return challenge answer.
    */
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }


    return 1 + Math.max(this.maxDepth(root.left), this.maxDepth(root.right));
  }
}
