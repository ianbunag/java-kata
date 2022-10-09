package dev.ianbunag.java_kata.codewars;

/**
 * Challenge solution.
 */
public class N7SudokuValidator {
  private N7SudokuValidator() { }

  /**
   * Sum of rows, columns and sections.
   */
  private static final int SUDOKU_SUM = 45;

  /**
   * 3x3 section x and y start coordinates.
   */
  private static final int[][] SECTION_STARTS = {
    {0, 0}, {0, 3}, {0, 6},
    {3, 0}, {3, 3}, {3, 6},
    {6, 0}, {6, 3}, {6, 6},
  };

  /**
   * Section height and width.
   */
  private static final int SECTION_DIMENSION = 3;

  /**
   * Sudoku height and width.
   */
  private static final int SUDOKU_DIMENSION = 9;

  /**
   * Challenge solution.
   * <ul>
   *  <li>Average time complexity: O(log n)
   *  <li>Worst time complexity:   O(n)
   *  <li>Space complexity:        O(1)
   * </ul>
   *
   * @param sudoku Sudoku matrix.
   * @return true if sudoku is valid.
   */
  public static boolean check(int[][] sudoku) {
    for (int row = 0; row < N7SudokuValidator.SUDOKU_DIMENSION; row += 1) {
      if (!N7SudokuValidator.rowIsValid(sudoku, row)) {
        return false;
      }
    }

    for (int column = 0; column < N7SudokuValidator.SUDOKU_DIMENSION; column += 1) {
      if (!N7SudokuValidator.columnIsValid(sudoku, column)) {
        return false;
      }
    }

    for (int[] sectionStart : N7SudokuValidator.SECTION_STARTS) {
      var row = sectionStart[0];
      var column = sectionStart[1];

      if (!N7SudokuValidator.sectionIsValid(sudoku, row, column)) {
        return false;
      }
    }

    return true;
  }

  private static boolean isInvalidValue(int value) {
    return value < 1 || value > N7SudokuValidator.SUDOKU_DIMENSION;
  }

  private static boolean rowIsValid(int[][] sudoku, int row) {
    var tracker = new Tracker(N7SudokuValidator.SUDOKU_DIMENSION);
    var sum = 0;

    for (int column = 0; column < N7SudokuValidator.SUDOKU_DIMENSION; column += 1) {
      var value = sudoku[row][column];

      if (N7SudokuValidator.isInvalidValue(value)) {
        return false;
      }

      if (tracker.track(value)) {
        return false;
      }

      sum += value;
    }

    return sum == N7SudokuValidator.SUDOKU_SUM;
  }

  private static boolean columnIsValid(int[][] sudoku, int column) {
    var tracker = new Tracker(N7SudokuValidator.SUDOKU_DIMENSION);
    var sum = 0;

    for (int row = 0; row < N7SudokuValidator.SUDOKU_DIMENSION; row += 1) {
      var value = sudoku[row][column];

      if (N7SudokuValidator.isInvalidValue(value)) {
        return false;
      }

      if (tracker.track(value)) {
        return false;
      }

      sum += value;
    }

    return sum == N7SudokuValidator.SUDOKU_SUM;
  }

  private static boolean sectionIsValid(int[][] sudoku, int row, int column) {
    var tracker = new Tracker(N7SudokuValidator.SUDOKU_DIMENSION);
    var sum = 0;
    var endRow = row + N7SudokuValidator.SECTION_DIMENSION;
    var currentRow = row;

    for (; currentRow < endRow; currentRow += 1) {
      var currentColumn = column;
      var endColumn = column + N7SudokuValidator.SECTION_DIMENSION;

      for (; currentColumn < endColumn; currentColumn += 1) {
        var value = sudoku[currentRow][currentColumn];

        if (N7SudokuValidator.isInvalidValue(value)) {
          return false;
        }

        if (tracker.track(value)) {
          return false;
        }

        sum += value;
      }
    }

    return sum == N7SudokuValidator.SUDOKU_SUM;
  }

  private static class Tracker {
    /**
     * Tracked values.
     */
    private Boolean[] memory;

    Tracker(int length) {
      memory = new Boolean[length];
    }

    public boolean track(int value) {
      if (memory[value - 1] == null) {
        memory[value - 1] = true;

        return false;
      }

      return true;
    }
  }
}
