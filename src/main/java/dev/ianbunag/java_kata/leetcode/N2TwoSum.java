package dev.ianbunag.java_kata.leetcode;

import java.util.HashMap;

/**
 * Challenge solution.
 */
public class N2TwoSum {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(log n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(n log n)
    * </ul>
    *
    * @return challenge answer.
    */
  public int[] twoSum(int[] numbers, int target) {
    var remainders = new HashMap<Integer, Integer>();

    for (var index = 0; index < numbers.length; index += 1) {
      var currentValue = numbers[index];

      if (remainders.containsKey(currentValue)) {
        return new int[]{index, remainders.get(currentValue)};
      }

      remainders.put(target - currentValue, index);
    }

    return new int[]{};
  }
}
