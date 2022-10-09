package dev.ianbunag.java_kata.codewars;

import java.math.BigInteger;

/**
 * Challenge solution.
 */
public class N4GapInPrimes {
  private N4GapInPrimes() { }

  /**
   * Challenge solution.
   * <ul>
   *  <li>Average time complexity: O(log n)
   *  <li>Worst time complexity:   O(n)
   *  <li>Space complexity:        O(1)
   * </ul>
   *
   * @param gap gap requirement.
   * @param start start number.
   * @param end end number.
   * @return the first pair of prime numbers with the given gap.
   */
  public static long[] gap(int gap, long start, long end) {
    var bigEnd = new BigInteger(String.valueOf(end));
    var bigGap = new BigInteger(String.valueOf(gap));
    var current = new BigInteger(String.valueOf(start - 1)).nextProbablePrime();

    while (current.compareTo(bigEnd) < 1) {
      var next = current.nextProbablePrime();

      if (next.subtract(current).compareTo(bigGap) == 0) {
        return new long[]{current.longValue(), next.longValue()};
      }

      current = next;
    }

    return null;
  }
}
