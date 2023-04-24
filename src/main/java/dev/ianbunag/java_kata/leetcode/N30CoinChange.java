package dev.ianbunag.java_kata.leetcode;

import java.util.Arrays;

/**
 * Challenge solution.
 */
public class N30CoinChange {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  public int coinChange(int[] coins, int amount) {
    final var noBottomUpResult = amount + 1;
    final var bottomUpResults = new int[amount + 1];
    Arrays.fill(bottomUpResults, 1, bottomUpResults.length, noBottomUpResult);

    for (var bottomUpResult = 1; bottomUpResult < bottomUpResults.length; bottomUpResult += 1) {
      for (var coin : coins) {
        if (bottomUpResult - coin >= 0) {
          bottomUpResults[bottomUpResult] = Math.min(
            bottomUpResults[bottomUpResult],
            1 + bottomUpResults[bottomUpResult - coin]
          );
        }
      }
    }

    final var amountResult = bottomUpResults[bottomUpResults.length - 1];

    return amountResult != noBottomUpResult ? amountResult : -1;
  }
}
