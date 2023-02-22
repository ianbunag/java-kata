package dev.ianbunag.java_kata.leetcode;

import dev.ianbunag.java_kata.lib.TreeNode;

/**
 * Challenge solution.
 */
public class N14SubtreeOfAnotherTree {
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
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (root == null) {
      return false;
    }

    return this.isSameTree(root, subRoot)
      || this.isSubtree(root.left, subRoot)
      || this.isSubtree(root.right, subRoot);
  }

  /**
   * Returns true if first and second trees are equivalent.
   */
  public boolean isSameTree(TreeNode first, TreeNode second) {
    return first == second
      || first != null
      && second != null
      && first.val == second.val
      && this.isSameTree(first.left, second.left)
      && this.isSameTree(first.right, second.right);
  }
}
