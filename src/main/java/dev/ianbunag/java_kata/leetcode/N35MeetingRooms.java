package dev.ianbunag.java_kata.leetcode;

import java.util.List;
import java.util.PriorityQueue;

/**
 * Challenge solution.
 */
public class N35MeetingRooms {
  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n log n)
    *  <li>Worst time complexity:   O(n log n)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  public boolean canAttendMeetings(List<Interval> intervals) {
    final var orderedIntervals = new PriorityQueue<Interval>(
        (first, second) -> Integer.compare(first.start, second.start)
    );
    orderedIntervals.addAll(intervals);

    for (var previous = orderedIntervals.poll(); !orderedIntervals.isEmpty();) {
      final var current = orderedIntervals.poll();

      if (previous.end > current.start) {
        return false;
      }

      previous = current;
    }

    return true;
  }

  /**
   * Interval.
   */
  public static class Interval {
    int start;
    int end;

    Interval(int start, int end) {
      this.start = start;
      this.end = end;
    }
  }
}
