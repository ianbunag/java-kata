package dev.ianbunag.java_kata.codewars;

/**
 * Challenge solution.
 */
public class N17GreedIsGood {
  private N17GreedIsGood() { }

  private static class Reference {
    protected static int ONE = 0;
    protected static int TWO = 1;
    protected static int THREE = 2;
    protected static int FOUR = 3;
    protected static int FIVE = 4;
    protected static int SIX = 5;
  }

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n log n)
    *  <li>Worst time complexity:   O(2n)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  public static int greedy(int[] dice) {
    var occurences = new int[6];
    var points = 0;

    for (int value : dice) {
      occurences[value - 1] += 1;
    }

    while (occurences[Reference.ONE] > 2) {
      occurences[Reference.ONE] -= 3;
      points += 1000;
    }

    while (occurences[Reference.TWO] > 2) {
      occurences[Reference.TWO] -= 3;
      points += 200;
    }

    while (occurences[Reference.THREE] > 2) {
      occurences[Reference.THREE] -= 3;
      points += 300;
    }

    while (occurences[Reference.FOUR] > 2) {
      occurences[Reference.FOUR] -= 3;
      points += 400;
    }

    while (occurences[Reference.FIVE] > 2) {
      occurences[Reference.FIVE] -= 3;
      points += 500;
    }

    while (occurences[Reference.SIX] > 2) {
      occurences[Reference.SIX] -= 3;
      points += 600;
    }

    while (occurences[Reference.ONE] > 0) {
      occurences[Reference.ONE] -= 1;
      points += 100;
    }

    while (occurences[Reference.FIVE] > 0) {
      occurences[Reference.FIVE] -= 1;
      points += 50;
    }

    return points;
  }
}
