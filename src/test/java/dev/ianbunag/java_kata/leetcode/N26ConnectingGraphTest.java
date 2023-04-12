package dev.ianbunag.java_kata.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N26ConnectingGraphTest {
  @Test
  public void it_should_count_components_of_connected_graphs() throws Exception {
    var solution = new N26ConnectingGraph();
    var edges = new int[][]{
      {0, 1},
      {1, 3},
      {0, 3},
    };

    assertEquals(3, solution.countComponents(5, edges));
  }

  @Test
  public void it_should_count_components_of_complex_connected_graphs() throws Exception {
    var solution = new N26ConnectingGraph();
    var edges = new int[][]{
      {0, 1},
      {6, 7},
      {2, 8},
      {2, 3},
      {2, 9},
      {2, 4},
      {2, 10},
      {3, 8},
      {3, 9},
      {8, 9},
      {8, 4},
      {8, 10},
      {4, 3},
      {4, 9},
      {4, 10},
      {10, 3},
      {10, 9},
      {11, 11},
    };
    assertEquals(5, solution.countComponents(12, edges));
  }

  @Test
  public void it_should_count_components_of_disconnected_graphs() throws Exception {
    var solution = new N26ConnectingGraph();
    assertEquals(6, solution.countComponents(6, new int[][]{}));
  }
}
