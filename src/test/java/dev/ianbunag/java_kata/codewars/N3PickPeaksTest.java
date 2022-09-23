package dev.ianbunag.java_kata.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;
import java.util.stream.Collectors;

public class N3PickPeaksTest {
  private static String[] msg = {
    "should support finding peaks, despite the plateau",
    "should support finding peaks",
    "should support finding peaks, but should ignore peaks on the edge of the array",
    "should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
    "should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
    "should support finding peaks, but should ignore peaks on the edge of the array",
    "should support complex peaks",
    "should support complex peaks",
  };

  private static int[][] array = {
    {2, 1, 3, 2, 2, 2, 2, 1},
    {1,2,3,6,4,1,2,3,2,1},
    {3,2,3,6,4,1,2,3,2,1,2,3},
    {3,2,3,6,4,1,2,3,2,1,2,2,2,1},
    {2,1,3,1,2,2,2,2,1},
    {2,1,3,1,2,2,2,2},
    {9, -4, -4, -5, -4, 17, 15, 4, 4, 18, 14, 9, 11, 14, 11, -4, 18, 0, 11, 0, -3, 0, 9, 5, 1, -5, 15, 14, 10},
    {10, 10, 6, -3, -5, 3, 7, 10, 4, 4, 18, 7, 6, 8, 8, -4, 9, 13, -3, 3, 7, 15},
  };

  private static int[][] posS  = {
    {2},
    {3,7},
    {3,7},
    {3,7,10},
    {2,4},
    {2},
    {5, 9, 13, 16, 18, 22, 26},
    {7, 10, 13, 17},
  };

  private static int[][] peaksS = {
    {3},
    {6,3},
    {6,3},
    {6,3,2},
    {3,2},
    {3},
    {17, 18, 14, 18, 11, 9, 15},
    {10, 18, 8, 13},
  };

  @Test
  public void testChallenge() throws Exception {
    for (int n = 0 ; n < msg.length ; n++) {
      final int[] p1 = posS[n], p2 = peaksS[n];
      Map<String,List<Integer>> expected = new HashMap<String,List<Integer>>() {{
          put("pos",   Arrays.stream(p1).boxed().collect(Collectors.toList()));
          put("peaks", Arrays.stream(p2).boxed().collect(Collectors.toList()));
      }},
      actual = N3PickPeaks.getPeaks(array[n]);
      assertEquals(msg[n], expected, actual);
  }
  }
}
