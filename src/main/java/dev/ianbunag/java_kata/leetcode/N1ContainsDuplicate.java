package dev.ianbunag.java_kata.leetcode;

import java.util.HashMap;

/**
 * Challenge solution.
 */
public class N1ContainsDuplicate {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(log n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  public boolean containsDuplicate(int[] numbers) {
    var found = new HashMap<Integer, Boolean>();

    for (var number : numbers) {
      if (found.containsKey(number)) {
        return true;
      }

      found.put(number, true);
    }

    return false;
  }
}
