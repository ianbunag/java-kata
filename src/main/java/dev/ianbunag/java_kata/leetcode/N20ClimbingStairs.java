package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N20ClimbingStairs {
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
  public int climbStairs(int n) {
    var previous = 0;
    var current = 1;

    for (; n > 0; n -= 1) {
      var previousCurrent = current;
      current += previous;
      previous = previousCurrent;
    }

    return current;
  }
}
