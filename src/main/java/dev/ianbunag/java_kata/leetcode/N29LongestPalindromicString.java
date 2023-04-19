package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N29LongestPalindromicString {
  private static int PARITY_ODD = 0;
  private static int PARITY_EVEN = 1;

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n ^ 2)
    *  <li>Worst time complexity:   O(n ^ 2)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return challenge answer.
    */
  public String longestPalindrome(String string) {
    var longestOdd = this.longestPalindrome(string, N29LongestPalindromicString.PARITY_ODD);
    var longestEven = this.longestPalindrome(string, N29LongestPalindromicString.PARITY_EVEN);

    return longestOdd.length() > longestEven.length()
      ? longestOdd
      : longestEven;
  }

  private String longestPalindrome(String string, int parity) {
    var longest = string.substring(0, 1);

    for (var position = 0; position < string.length(); position += 1) {
      var leftPosition = position;
      var rightPosition = position + parity;

      while (
          leftPosition >= 0
          && rightPosition < string.length()
          && string.charAt(leftPosition) == string.charAt(rightPosition)
      ) {
        leftPosition -= 1;
        rightPosition += 1;
      }

      leftPosition += 1;

      if (rightPosition - leftPosition > longest.length()) {
        longest = string.substring(leftPosition, rightPosition);
      }
    }

    return longest;
  }
}
