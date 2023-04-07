package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N21FindMedianFromDataStreamTest {
  @Test
  public void it_should_find_median_of_simple_stream() throws Exception {
    var finder = new N21FindMedianFromDataStream();
    finder.addNum(1);
    finder.addNum(2);
    assertEquals(1.5, finder.findMedian());
    finder.addNum(3);
    assertEquals(2.0, finder.findMedian());
  }
}
