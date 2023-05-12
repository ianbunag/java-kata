package dev.ianbunag.java_kata.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Challenge solution.
 */
public class N37NonOverlappingIntervals {
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
  public int eraseOverlapIntervals(final int[][] intervals) {
    var minimumRemoved = 0;

    Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

    for (var current = 1; current < intervals.length; current += 1) {
      // Current interval overlaps with previous interval.
      if (intervals[current][0] < intervals[current - 1][1]) {
        // Retain interval with smaller end value.
        intervals[current][1] = Math.min(intervals[current][1], intervals[current - 1][1]);
        minimumRemoved += 1;
      }
    }

    return minimumRemoved;
  }
}
