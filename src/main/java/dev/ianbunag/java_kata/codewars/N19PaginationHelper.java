package dev.ianbunag.java_kata.codewars;

import java.util.List;

/**
 * Challenge solution.
 */
public class N19PaginationHelper<I> {
  List<I> collection;
  int itemsPerPage;

  /**
   * The constructor takes in an array of items and a integer indicating how many
   * items fit within a single page.
   */
  public N19PaginationHelper(List<I> collection, int itemsPerPage) {
    this.collection = collection;
    this.itemsPerPage = itemsPerPage;
  }

  /**
   * returns the number of items within the entire collection.
   * <ul>
   *  <li>Average time complexity: O(1)
   *  <li>Worst time complexity:   O(1)
   *  <li>Space complexity:        O(1)
   * </ul>
   */
  public int itemCount() {
    return collection.size();
  }

  /**
   * returns the number of pages.
   * <ul>
   *  <li>Average time complexity: O(1)
   *  <li>Worst time complexity:   O(1)
   *  <li>Space complexity:        O(1)
   * </ul>
   */
  public int pageCount() {
    int count = itemCount() / itemsPerPage;

    if (itemCount() % itemsPerPage > 0) {
      count += 1;
    }

    return count;
  }

  /**
   * returns the number of items on the current page. page_index is zero based.
   * this method should return -1 for pageIndex values that are out of range
   * <ul>
   *  <li>Average time complexity: O(1)
   *  <li>Worst time complexity:   O(1)
   *  <li>Space complexity:        O(1)
   * </ul>
   */
  public int pageItemCount(int pageIndex) {
    if (pageIndex >= pageCount()) {
      return -1;
    }

    if (pageIndex == pageCount() - 1) {
      return itemCount() % itemsPerPage;
    }

    return itemsPerPage;
  }

  /**
   * determines what page an item is on. Zero based indexes
   * this method should return -1 for itemIndex values that are out of range.
   * <ul>
   *  <li>Average time complexity: O(1)
   *  <li>Worst time complexity:   O(1)
   *  <li>Space complexity:        O(1)
   * </ul>
   */
  public int pageIndex(int itemIndex) {
    if (itemIndex < 0 || itemIndex >= itemCount()) {
      return -1;
    }

    return itemIndex / itemsPerPage;
  }
}
