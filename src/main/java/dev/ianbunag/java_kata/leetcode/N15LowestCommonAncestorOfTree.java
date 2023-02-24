package dev.ianbunag.java_kata.leetcode;

import dev.ianbunag.java_kata.lib.TreeNode;

/**
 * Challenge solution.
 */
public class N15LowestCommonAncestorOfTree {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(log n)
    *  <li>Worst time complexity:   O(log n)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return challenge answer.
    */
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root.val > p.val && root.val > q.val) {
      return this.lowestCommonAncestor(root.left, p, q);
    }

    if (root.val < p.val && root.val < q.val) {
      return this.lowestCommonAncestor(root.right, p, q);
    }

    return root;
  }
}
