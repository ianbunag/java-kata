package dev.ianbunag.java_kata.leetcode;

import java.util.ArrayList;

/**
 * Challenge solution.
 */
public class N36InsertInterval {
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
  public int[][] insert(int[][] intervals, int[] newInterval) {
    final var newIntervals = new ArrayList<int[]>();
    var current = 0;

    for (; current < intervals.length; current += 1) {
      // newInterval comes before currentInterval.
      if (newInterval[1] < intervals[current][0]) {
        break;
      }

      // newInterval comes after currentInterval.
      if (newInterval[0] > intervals[current][1]) {
        newIntervals.add(intervals[current]);
        continue;
      }

      // newInterval intersects with currentInterval.
      newInterval[0] = Math.min(newInterval[0], intervals[current][0]);
      newInterval[1] = Math.max(newInterval[1], intervals[current][1]);
    }

    newIntervals.add(newInterval);

    for (; current < intervals.length; current += 1) {
      newIntervals.add(intervals[current]);
    }


    return newIntervals.toArray(new int[newIntervals.size()][2]);
  }
}
