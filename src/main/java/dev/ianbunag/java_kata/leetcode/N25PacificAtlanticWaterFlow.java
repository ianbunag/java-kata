package dev.ianbunag.java_kata.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Challenge solution.
 */
public class N25PacificAtlanticWaterFlow {
  public static byte EMPTY_STATE = 0b0;
  public static byte IS_EXPLORING = 0b001;
  public static byte IS_PACIFIC = 0b010;
  public static byte IS_ATLANTIC = 0b100;


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
  public List<List<Integer>> pacificAtlantic(int[][] heights) {
    var states = N25PacificAtlanticWaterFlow.createStates(heights.length, heights[0].length);
    var flow = new ArrayList<List<Integer>>();

    for (var row = 0; row < heights.length; row += 1) {
      for (var column = 0; column < heights[row].length; column += 1) {
        if (
            this.canFlowToPacific(heights, row, column, states)
            && this.canFlowToAtlantic(heights, row, column, states)
        ) {
          flow.add(Arrays.asList(row, column));
        }
      }
    }

    return flow;
  }

  private boolean canFlowToPacific(
      int[][] heights,
      int row,
      int column,
      byte[][] states
  ) {
    if (N25PacificAtlanticWaterFlow.isState(
        states[row][column],
        N25PacificAtlanticWaterFlow.IS_EXPLORING)
    ) {
      return false;
    }

    // Skip if cell already flows to Pacific
    if (N25PacificAtlanticWaterFlow.isState(
        states[row][column],
        N25PacificAtlanticWaterFlow.IS_PACIFIC)
    ) {
      return true;
    }

    states[row][column] = N25PacificAtlanticWaterFlow.addState(
      states[row][column],
      N25PacificAtlanticWaterFlow.IS_EXPLORING
    );

    if (
        row <= 0
        || column <= 0
        || this.canFlowTo(heights, row, column, row - 1, column)
        && this.canFlowToPacific(heights, row - 1, column, states)
        || this.canFlowTo(heights, row, column, row, column - 1)
        && this.canFlowToPacific(heights, row, column - 1, states)
        || this.canFlowTo(heights, row, column, row + 1, column)
        && this.canFlowToPacific(heights, row + 1, column, states)
        || this.canFlowTo(heights, row, column, row, column + 1)
        && this.canFlowToPacific(heights, row, column + 1, states)
    ) {
      states[row][column] = N25PacificAtlanticWaterFlow.addState(
        states[row][column],
        N25PacificAtlanticWaterFlow.IS_PACIFIC
      );
    }

    states[row][column] = N25PacificAtlanticWaterFlow.removeState(
      states[row][column],
      N25PacificAtlanticWaterFlow.IS_EXPLORING
    );

    return N25PacificAtlanticWaterFlow.isState(
      states[row][column],
      N25PacificAtlanticWaterFlow.IS_PACIFIC
    );
  }

  private boolean canFlowToAtlantic(
      int[][] heights,
      int row,
      int column,
      byte[][] states
  ) {
    if (N25PacificAtlanticWaterFlow.isState(
        states[row][column],
        N25PacificAtlanticWaterFlow.IS_EXPLORING)
    ) {
      return false;
    }

    // Skip if cell already flows to Atlantic
    if (N25PacificAtlanticWaterFlow.isState(
        states[row][column],
        N25PacificAtlanticWaterFlow.IS_ATLANTIC)
    ) {
      return true;
    }

    states[row][column] = N25PacificAtlanticWaterFlow.addState(
      states[row][column],
      N25PacificAtlanticWaterFlow.IS_EXPLORING
    );

    if (
        row >= heights.length - 1
        || column >= heights[0].length - 1
        || this.canFlowTo(heights, row, column, row + 1, column)
        && this.canFlowToAtlantic(heights, row + 1, column, states)
        || this.canFlowTo(heights, row, column, row, column + 1)
        && this.canFlowToAtlantic(heights, row, column + 1, states)
        || this.canFlowTo(heights, row, column, row - 1, column)
        && this.canFlowToAtlantic(heights, row - 1, column, states)
        || this.canFlowTo(heights, row, column, row, column - 1)
        && this.canFlowToAtlantic(heights, row, column - 1, states)
    ) {
      states[row][column] = N25PacificAtlanticWaterFlow.addState(
        states[row][column],
        N25PacificAtlanticWaterFlow.IS_ATLANTIC
      );
    }

    states[row][column] = N25PacificAtlanticWaterFlow.removeState(
      states[row][column],
      N25PacificAtlanticWaterFlow.IS_EXPLORING
    );

    return N25PacificAtlanticWaterFlow.isState(
      states[row][column],
      N25PacificAtlanticWaterFlow.IS_ATLANTIC
    );
  }

  private boolean canFlowTo(
      int[][] heights,
      int fromRow,
      int fromColumn,
      int toRow,
      int toColumn
  ) {
    return fromRow >= 0
      && fromRow < heights.length
      && fromColumn >= 0
      && fromColumn < heights[0].length
      && toRow >= 0
      && toRow < heights.length
      && toColumn >= 0
      && toColumn < heights[0].length
      && heights[fromRow][fromColumn] >= heights[toRow][toColumn];
  }

  public static boolean isState(byte source, byte target) {
    return (source & target) == target;
  }

  public static byte addState(byte source, byte target) {
    return (byte) (source | target);
  }

  public static byte removeState(byte source, byte target) {
    return (byte) (source & ~target);
  }

  private static byte[][] createStates(int rows, int columns) {
    byte[][] states = new byte[rows][columns];

    for (var row = 0; row < rows; row += 1) {
      for (var column = 0; column < columns; column += 1) {
        states[row][column] = N25PacificAtlanticWaterFlow.EMPTY_STATE;
      }
    }

    return states;
  }
}
