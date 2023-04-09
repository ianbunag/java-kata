package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N23NumberOfIslands {
  private static char LAND = '1';
  private static char EXPLORED = 'X';

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return challenge answer.
    */
  public int numIslands(char[][] grid) {
    var islands = 0;

    for (var row = 0; row < grid.length; row += 1) {
      for (var column = 0; column < grid[row].length; column += 1) {
        if (grid[row][column] == N23NumberOfIslands.LAND) {
          islands += 1;
        }

        this.explore(grid, row, column);
      }
    }

    return islands;
  }

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(1)
    *  <li>Worst time complexity:   O(1)
    *  <li>Space complexity:        O(1)
    * </ul>
    */
  public void explore(char[][] grid, int row, int column) {
    if (
        row < 0
        || column < 0
        || row >= grid.length
        || column >= grid[row].length
        || grid[row][column] != N23NumberOfIslands.LAND
    ) {
      return;
    }

    grid[row][column] = N23NumberOfIslands.EXPLORED;

    this.explore(grid, row + 1, column);
    this.explore(grid, row, column + 1);
    this.explore(grid, row - 1, column);
    this.explore(grid, row, column - 1);
  }
}
