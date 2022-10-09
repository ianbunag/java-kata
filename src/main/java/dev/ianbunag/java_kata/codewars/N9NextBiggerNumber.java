package dev.ianbunag.java_kata.codewars;

import java.util.Arrays;

/**
 * Challenge solution.
 */
public class N9NextBiggerNumber {
  private N9NextBiggerNumber() { }

  /**
   * Forfeited challenge solution.
   * See https://www.codewars.com/kata/reviews/57fa47c9341b671ebc00005d/groups/5965ecf6bf214fec080005b3.
   * <ul>
   *  <li>Average time complexity: O(log n)
   *  <li>Worst time complexity:   O(n log n)
   *  <li>Space complexity:        O(n)
   * </ul>
   *
   * @param number Starting number
   * @return Next bigger number.
   */
  public static long nextBiggerNumber(long number) {
    var numbers = Long.toString(number).toCharArray();

    for (var targetIndex = numbers.length - 2; targetIndex >= 0; targetIndex--) {
      var beforeTargetIndex = numbers.length - 1;
      for (; beforeTargetIndex > targetIndex; beforeTargetIndex--) {
        var targetValue = numbers[targetIndex];
        var beforeTargetValue = numbers[beforeTargetIndex];

        if (targetValue < beforeTargetValue) {
          numbers[targetIndex] = beforeTargetValue;
          numbers[beforeTargetIndex] = targetValue;
          Arrays.sort(numbers, targetIndex + 1, numbers.length);

          return Long.valueOf(new String(numbers));
        }
      }
    }

    return -1;
  }
}
