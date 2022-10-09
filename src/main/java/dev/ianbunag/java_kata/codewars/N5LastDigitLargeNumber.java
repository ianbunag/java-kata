package dev.ianbunag.java_kata.codewars;

import java.math.BigInteger;

/**
 * Challenge solution.
 */
public class N5LastDigitLargeNumber {
  private N5LastDigitLargeNumber() { }

  /**
   * Exponent difference where the result last digit is the same.
   */
  private static final BigInteger EXPONENT_DIFFERENCE = new BigInteger("4");

  /**
   * Challenge solution.
   * <ul>
   *  <li>Average time complexity: O(1)
   *  <li>Worst time complexity:   O(1)
   *  <li>Space complexity:        O(1)
   * </ul>
   *
   * @param value Value.
   * @param exponent Exponent.
   * @return Last digit.
   */
  public static int lastDigit(
      BigInteger value,
      BigInteger exponent
  ) {
    if (exponent.toString() == "0") {
      return 1;
    }

    var lastDigitValue = N5LastDigitLargeNumber.getLastDigit(value);
    var commonExponent = N5LastDigitLargeNumber.getCommonExponent(exponent);
    var lastDigitPower = lastDigitValue.pow(commonExponent.intValue());

    return N5LastDigitLargeNumber.getLastDigit(lastDigitPower).intValue();
  }

  private static BigInteger getLastDigit(BigInteger value) {
    var stringValue = value.toString();

    return new BigInteger(stringValue.substring(stringValue.length() - 1));
  }

  private static BigInteger getCommonExponent(BigInteger value) {
    var commonExponent = value.mod(N5LastDigitLargeNumber.EXPONENT_DIFFERENCE);

    if (commonExponent.intValue() == 0) {
      return N5LastDigitLargeNumber.EXPONENT_DIFFERENCE;
    }

    return commonExponent;
  }
}
