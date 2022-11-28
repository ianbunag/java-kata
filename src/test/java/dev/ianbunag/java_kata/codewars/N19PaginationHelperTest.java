package dev.ianbunag.java_kata.codewars;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

/**
 * Challenge tests.
 */
public class N19PaginationHelperTest {
  @Test
  public void testChallenge() throws Exception {
    var list = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f');
    N19PaginationHelper<Character> helper = new N19PaginationHelper<Character>(list, 4);

    assertEquals(helper.pageCount(), 2);
    assertEquals(helper.itemCount(), 6);
    assertEquals(helper.pageItemCount(0), 4);
    assertEquals(helper.pageItemCount(1), 2);
    assertEquals(helper.pageItemCount(2), -1);
    assertEquals(helper.pageIndex(5), 1);
    assertEquals(helper.pageIndex(2), 0);
    assertEquals(helper.pageIndex(20), -1);
    assertEquals(helper.pageIndex(-10), -1);

    var list2 = Arrays.asList(
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
        '0', '1', '2', '3'
    );
    N19PaginationHelper<Character> helper2 = new N19PaginationHelper<Character>(list2, 10);

    assertEquals(helper2.pageItemCount(2), 4);
  }
}
