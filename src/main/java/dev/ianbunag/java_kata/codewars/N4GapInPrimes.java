package dev.ianbunag.java_kata.codewars;

import java.math.BigInteger;

public final class N4GapInPrimes {
  private N4GapInPrimes() { }

  /**
   * Challenge solution.
   *
   * Average time complexity: O(log n)
   * Worst time complexity:   O(n)
   * Space complexity:        O(1)
   *
   * @param gap
   * @param start
   * @param end
   * @return the first pair of prime numbers with the given gap.
   */
  public static long[] gap(final int gap, final long start, final long end) {
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
