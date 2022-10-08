package dev.ianbunag.java_kata.codewars;

import java.util.Arrays;

public final class N9NextBiggerNumber {
  private N9NextBiggerNumber() { }

  /**
   * Forfeited challenge solution.
   * See https://www.codewars.com/kata/reviews/57fa47c9341b671ebc00005d/groups/5965ecf6bf214fec080005b3.
   *
   * Average time complexity: O(log n)
   * Worst time complexity:   O(n log n)
   * Space complexity:        O(n)
   *
   * @param number
   * @return Next bigger number.
   */
  public static long nextBiggerNumber(final long number) {
    var numbers = Long.toString(number).toCharArray();

    for (
      var targetIndex = numbers.length - 2;
      targetIndex >= 0;
      targetIndex--
    ) {
      for (
        var beforeTargetIndex = numbers.length - 1;
        beforeTargetIndex > targetIndex;
        beforeTargetIndex--
      ) {
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
