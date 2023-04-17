package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N28HouseRobber {
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
  public int rob(int[] houses) {
    int highest = 0;
    int closest = 0;

    for (var house : houses) {
      var nextHighest = Math.max(highest, closest + house);

      closest = highest;
      highest = nextHighest;
    }

    return highest;
  }
}
