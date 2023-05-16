package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N38HappyNumber {
  private static int[] SQUARES = new int[]{0, 1, 4, 9, 16, 25, 36, 49, 64, 81};

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n log n)
    *  <li>Worst time complexity:   O(n log n)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return challenge answer.
    */
  public boolean isHappy(final int value) {
    var slow = value;
    var fast = value;

    while (slow != 1) {
      slow = this.getSumOfSquaredDigits(slow);
      fast = this.getSumOfSquaredDigits(this.getSumOfSquaredDigits(fast));

      if (slow == fast) {
        return slow == 1;
      }
    }

    return true;
  }

  /**
    * Get sum of squared digits.
    * <ul>
    *  <li>Average time complexity: O(log n)
    *  <li>Worst time complexity:   O(log n)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return sum of squared digits.
    */
  private int getSumOfSquaredDigits(int value) {
    var sum = 0;

    while (value > 0) {
      sum += SQUARES[value % 10];
      value /= 10;
    }

    return sum;
  }
}
