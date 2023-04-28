package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N32UniquePaths {
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
  public int uniquePaths(int rows, final int columns) {
    final var paths = new int[columns];
    paths[columns - 1] = 1;

    for (; rows > 0; rows -= 1) {
      for (var column = columns - 2; column >= 0; column -= 1) {
        paths[column] += paths[column + 1];
      }
    }

    return paths[0];
  }
}
