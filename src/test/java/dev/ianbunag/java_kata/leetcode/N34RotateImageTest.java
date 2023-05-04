package dev.ianbunag.java_kata.leetcode;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N34RotateImageTest {
  @Test
  public void it_should_rotate_1_x_1() throws Exception {
    var solution = new N34RotateImage();
    var matrix = new int[][]{{1}};
    var expected = new int[][]{{1}};

    solution.rotate(matrix);

    assertArrayEquals(expected, matrix);
  }

  @Test
  public void it_should_rotate_2_x_2() throws Exception {
    var solution = new N34RotateImage();
    var matrix = new int[][]{
      {1, 2},
      {3, 4},
    };
    var expected = new int[][]{
      {3, 1},
      {4, 2},
    };

    solution.rotate(matrix);

    assertArrayEquals(expected, matrix);
  }

  @Test
  public void it_should_rotate_3_x_3() throws Exception {
    var solution = new N34RotateImage();
    var matrix = new int[][]{
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9},
    };
    var expected = new int[][]{
      {7, 4, 1},
      {8, 5, 2},
      {9, 6, 3},
    };

    solution.rotate(matrix);

    assertArrayEquals(expected, matrix);
  }

  @Test
  public void it_should_rotate_4_x_4() throws Exception {
    var solution = new N34RotateImage();
    var matrix = new int[][]{
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12},
      {13, 14, 15, 16},
    };
    var expected = new int[][]{
      {13, 9, 5, 1},
      {14, 10, 6, 2},
      {15, 11, 7, 3},
      {16, 12, 8, 4},
    };

    solution.rotate(matrix);

    assertArrayEquals(expected, matrix);
  }

  @Test
  public void it_should_rotate_5_x_5() throws Exception {
    var solution = new N34RotateImage();
    var matrix = new int[][]{
      {1, 2, 3, 4, 5},
      {6, 7, 8, 9, 10},
      {11, 12, 13, 14, 15},
      {16, 17, 18, 19, 20},
      {21, 22, 23, 24, 25},
    };
    var expected = new int[][]{
      {21, 16, 11, 6, 1},
      {22, 17, 12, 7, 2},
      {23, 18, 13, 8, 3},
      {24, 19, 14, 9, 4},
      {25, 20, 15, 10, 5},
    };

    solution.rotate(matrix);

    assertArrayEquals(expected, matrix);
  }
}
