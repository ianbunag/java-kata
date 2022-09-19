package dev.ianbunag.java_kata.codewars;

public final class FactorialNumberOfTrailingZeros {
  private FactorialNumberOfTrailingZeros() { }

  /**
   * See explanations below.
   *  - https://www.purplemath.com/modules/factzero.htm
   *  - https://www.handakafunda.com/number-of-trailing-zeros/
   */
  private static final int ZERO_MULTIPLE = 5;

  /**
   * Challenge solution.
   *
   * Average time complexity: O(n log n)
   * Worst time complexity:   O(n log n)
   * Space complexity:        O(1)
   *
   * @param number
   * @return number of trailing zeros in factorial of number.
   */
  public static int zeros(final int number) {
    int numberOfZeros = 0;
    int difference = number;

    while (difference >= FactorialNumberOfTrailingZeros.ZERO_MULTIPLE) {
      difference /= FactorialNumberOfTrailingZeros.ZERO_MULTIPLE;
      numberOfZeros += difference;
    }

    return numberOfZeros;
  }
}
