package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N39Power {
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
  public double myPow(double value, long exponent) {
    double result = 1.00000;
    final var isNegative = exponent < 0;

    for (exponent = Math.abs(exponent); exponent > 0; exponent /= 2) {
      if (exponent % 2 == 1) {
        result *= value;
      }

      value *= value;
    }

    return isNegative ? 1 / result : result;
  }
}
