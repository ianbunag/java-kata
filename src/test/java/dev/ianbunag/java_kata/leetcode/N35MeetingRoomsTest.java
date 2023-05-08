package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

/**
 * Challenge tests.
 */
public class N35MeetingRoomsTest {
  @Test
  public void testChallenge() throws Exception {
    var solution = new N35MeetingRooms();

    assertEquals(
        false,
        solution.canAttendMeetings(
          Arrays.asList(new N35MeetingRooms.Interval[]{
            new N35MeetingRooms.Interval(1, 4),
            new N35MeetingRooms.Interval(5, 6),
            new N35MeetingRooms.Interval(4, 6),
          })
        )
    );
    assertEquals(true, solution.canAttendMeetings(new ArrayList<N35MeetingRooms.Interval>()));
    assertEquals(
        true,
        solution.canAttendMeetings(
          Arrays.asList(new N35MeetingRooms.Interval[]{
            new N35MeetingRooms.Interval(1, 2),
          })
        )
    );
    assertEquals(
        true,
        solution.canAttendMeetings(
          Arrays.asList(new N35MeetingRooms.Interval[]{
            new N35MeetingRooms.Interval(5, 8),
            new N35MeetingRooms.Interval(9, 15),
          })
        )
    );
    assertEquals(
        true,
        solution.canAttendMeetings(
          Arrays.asList(new N35MeetingRooms.Interval[]{
            new N35MeetingRooms.Interval(0, 8),
            new N35MeetingRooms.Interval(8, 10),
          })
        )
    );
    assertEquals(
        false,
        solution.canAttendMeetings(
          Arrays.asList(new N35MeetingRooms.Interval[]{
            new N35MeetingRooms.Interval(0, 30),
            new N35MeetingRooms.Interval(5, 10),
            new N35MeetingRooms.Interval(15, 20),
          })
        )
    );
    assertEquals(
        true,
        solution.canAttendMeetings(
          Arrays.asList(new N35MeetingRooms.Interval[]{
            new N35MeetingRooms.Interval(11, 12),
            new N35MeetingRooms.Interval(0, 1),
            new N35MeetingRooms.Interval(1, 2),
            new N35MeetingRooms.Interval(2, 3),
            new N35MeetingRooms.Interval(4, 5),
            new N35MeetingRooms.Interval(8, 9),
            new N35MeetingRooms.Interval(7, 8),
            new N35MeetingRooms.Interval(6, 7),
          })
        )
    );
    assertEquals(
        false,
        solution.canAttendMeetings(
          Arrays.asList(new N35MeetingRooms.Interval[]{
            new N35MeetingRooms.Interval(0, 2),
            new N35MeetingRooms.Interval(1, 3),
          })
        )
    );
    assertEquals(
        false,
        solution.canAttendMeetings(
          Arrays.asList(new N35MeetingRooms.Interval[]{
            new N35MeetingRooms.Interval(1, 3),
            new N35MeetingRooms.Interval(0, 2),
          })
        )
    );
    assertEquals(
        false,
        solution.canAttendMeetings(
          Arrays.asList(new N35MeetingRooms.Interval[]{
            new N35MeetingRooms.Interval(1, 4),
            new N35MeetingRooms.Interval(4, 6),
            new N35MeetingRooms.Interval(5, 6),
          })
        )
    );
    assertEquals(
        false,
        solution.canAttendMeetings(
          Arrays.asList(new N35MeetingRooms.Interval[]{
            new N35MeetingRooms.Interval(1, 4),
            new N35MeetingRooms.Interval(5, 6),
            new N35MeetingRooms.Interval(4, 6),
          })
        )
    );
    assertEquals(
        false,
        solution.canAttendMeetings(
          Arrays.asList(new N35MeetingRooms.Interval[]{
            new N35MeetingRooms.Interval(5, 7),
            new N35MeetingRooms.Interval(7, 8),
            new N35MeetingRooms.Interval(7, 9),
          })
        )
    );
    assertEquals(
        false,
        solution.canAttendMeetings(
          Arrays.asList(new N35MeetingRooms.Interval[]{
            new N35MeetingRooms.Interval(5, 7),
            new N35MeetingRooms.Interval(7, 9),
            new N35MeetingRooms.Interval(7, 8),
          })
        )
    );
    assertEquals(
        false,
        solution.canAttendMeetings(
          Arrays.asList(new N35MeetingRooms.Interval[]{
            new N35MeetingRooms.Interval(11, 12),
            new N35MeetingRooms.Interval(10, 13),
            new N35MeetingRooms.Interval(7, 9),
          })
        )
    );
    assertEquals(
        false,
        solution.canAttendMeetings(
          Arrays.asList(new N35MeetingRooms.Interval[]{
            new N35MeetingRooms.Interval(10, 13),
            new N35MeetingRooms.Interval(11, 12),
            new N35MeetingRooms.Interval(7, 9),
          })
        )
    );

    var thousandJointIntervals = new ArrayList<N35MeetingRooms.Interval>();
    for (var index = 0; index < 1000; index += 1) {
      thousandJointIntervals.add(new N35MeetingRooms.Interval(index, index + 1));
    }
    assertEquals(true, solution.canAttendMeetings(thousandJointIntervals));

    var thousandDisjointIntervals = new ArrayList<N35MeetingRooms.Interval>();
    for (var index = 0; index < 1000; index += 1) {
      var start = (2 * index) + 1;
      thousandDisjointIntervals.add(new N35MeetingRooms.Interval(start, start + 1));
    }
    assertEquals(true, solution.canAttendMeetings(thousandDisjointIntervals));
  }
}
