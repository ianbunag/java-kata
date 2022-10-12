package dev.ianbunag.java_kata.codewars;

/**
 * Challenge solution.
 */
public class N11LongestSlideDown {
  private N11LongestSlideDown() { }

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
  public static int longestSlideDown(int[][] pyramid) {
    var highest = pyramid[0][0];

    for (var row = 1; row < pyramid.length; row += 1) {
      var rowLength = pyramid[row].length;

      for (var column = 0; column < rowLength; column += 1) {
        var highestParent = 0;

        if (column == 0) {
          // Add first element of previous row
          highestParent = pyramid[row - 1][column];
        } else if (column == rowLength - 1) {
          // Add last element of previous row
          highestParent = pyramid[row - 1][rowLength - 2];
        } else {
          // Add highest adjacent left or right element of previous row
          highestParent = Math.max(pyramid[row - 1][column - 1], pyramid[row - 1][column]);
        }

        pyramid[row][column] += highestParent;

        if (highest < pyramid[row][column]) {
          highest = pyramid[row][column];
        }
      }
    }

    return highest;
  }
}
