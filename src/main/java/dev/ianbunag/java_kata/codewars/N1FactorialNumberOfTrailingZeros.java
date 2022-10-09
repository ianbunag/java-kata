package dev.ianbunag.java_kata.codewars;

/**
 * Challenge solution.
 */
public class N1FactorialNumberOfTrailingZeros {
  private N1FactorialNumberOfTrailingZeros() { }

  /**
   * See explanations below.
   *  - https://www.purplemath.com/modules/factzero.htm
   *  - https://www.handakafunda.com/number-of-trailing-zeros/
   */
  private static int ZERO_MULTIPLE = 5;

  /**
   * Challenge solution.
   * <ul>
   *  <li>Average time complexity: O(n log n)
   *  <li>Worst time complexity:   O(n log n)
   *  <li>Space complexity:        O(1)
   * </ul>
   *
   * @param number number to assert.
   * @return number of trailing zeros in factorial of number.
   */
  public static int zeros(int number) {
    int numberOfZeros = 0;
    int difference = number;

    while (difference >= N1FactorialNumberOfTrailingZeros.ZERO_MULTIPLE) {
      difference /= N1FactorialNumberOfTrailingZeros.ZERO_MULTIPLE;
      numberOfZeros += difference;
    }

    return numberOfZeros;
  }
}
