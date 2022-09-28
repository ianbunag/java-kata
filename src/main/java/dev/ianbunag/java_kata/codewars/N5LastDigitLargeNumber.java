package dev.ianbunag.java_kata.codewars;

import java.math.BigInteger;

public final class N5LastDigitLargeNumber {
  private N5LastDigitLargeNumber() { }

  /**
   * Exponent difference where the result last digit is the same.
   */
  private static final BigInteger EXPONENT_DIFFERENCE = new BigInteger("4");

  /**
   * Challenge solution.
   *
   * Average time complexity: O(1)
   * Worst time complexity:   O(1)
   * Space complexity:        O(1)
   *
   * @param value
   * @param exponent
   * @return last digit.
   */
  public static int lastDigit(
    final BigInteger value,
    final BigInteger exponent
  ) {
    if (exponent.toString() == "0") {
      return 1;
    }

    var lastDigitValue = N5LastDigitLargeNumber.getLastDigit(value);
    var commonExponent = N5LastDigitLargeNumber.getCommonExponent(exponent);
    var lastDigitPower = lastDigitValue.pow(commonExponent.intValue());

    return N5LastDigitLargeNumber.getLastDigit(lastDigitPower).intValue();
  }

  private static BigInteger getLastDigit(final BigInteger value) {
    var stringValue = value.toString();

    return new BigInteger(stringValue.substring(stringValue.length() - 1));
  }

  private static BigInteger getCommonExponent(final BigInteger value) {
    var commonExponent = value.mod(N5LastDigitLargeNumber.EXPONENT_DIFFERENCE);

    if (commonExponent.intValue() == 0) {
      return N5LastDigitLargeNumber.EXPONENT_DIFFERENCE;
    }

    return commonExponent;
  }
}
