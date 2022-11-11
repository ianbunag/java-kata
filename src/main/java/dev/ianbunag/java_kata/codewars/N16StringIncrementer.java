package dev.ianbunag.java_kata.codewars;

import java.math.BigInteger;

/**
 * Challenge solution.
 */
public class N16StringIncrementer {
  private N16StringIncrementer() { }

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(1)
    *  <li>Worst time complexity:   O(1)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return challenge answer.
    */
  public static String incrementString(String str) {
    var trailingNumber = N16StringIncrementer.getTrailingNumbers(str);

    if (trailingNumber.isEmpty()) {
      return str + 1;
    }

    var nextValue = new BigInteger(trailingNumber)
        .add(new BigInteger("1"))
        .toString();
    var paddedValue = N16StringIncrementer.pad(nextValue, trailingNumber.length());
    var leadingStr = str.substring(0, str.length() - trailingNumber.length());

    return leadingStr + paddedValue;
  }

  /**
    * Get trailing numbers.
    * <ul>
    *  <li>Average time complexity: O(log n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return trailing number.
    */
  private static String getTrailingNumbers(String str) {
    var trailingNumbers = new StringBuilder();

    for (int index = str.length() - 1; index >= 0; index -= 1) {
      var character = str.charAt(index);

      if (character < '0' || character > '9') {
        break;
      }

      trailingNumbers.insert(0, character);
    }

    return trailingNumbers.toString();
  }

  private static String pad(String str, int length) {
    if (str.length() >= length) {
      return str;
    }

    StringBuilder padded = new StringBuilder();

    for (int index = length - str.length(); index > 0; index -= 1) {
      padded.append('0');
    }

    return padded.append(str).toString();
  }
}
