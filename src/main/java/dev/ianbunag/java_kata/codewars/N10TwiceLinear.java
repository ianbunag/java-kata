package dev.ianbunag.java_kata.codewars;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

/**
 * Challenge solution.
 */
public class N10TwiceLinear {
  private N10TwiceLinear() { }

  /**
   * Challenge solution.
   * <ul>
   *  <li>Average time complexity: O(n)
   *  <li>Worst time complexity:   O(n)
   *  <li>Space complexity:        O(n log n)
   * </ul>
   *
   * @return challenge answer.
   */
  public static int dblLinear(int n) {
    var values = new TreeSet<Integer>();
    Queue<Integer> queue = new PriorityQueue<>(Arrays.asList(1));

    while (values.size() <= n) {
      var value = queue.remove();

      values.add(value);
      queue.add((2 * value) + 1);
      queue.add((3 * value) + 1);
    }

    return values.last();
  }
}
