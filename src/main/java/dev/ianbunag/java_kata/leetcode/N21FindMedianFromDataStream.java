package dev.ianbunag.java_kata.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Challenge solution.
 */
public class N21FindMedianFromDataStream {
  private PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
  private PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

  /**
    * Add number to finder.
    * <ul>
    *  <li>Average time complexity: O(log n)
    *  <li>Worst time complexity:   O(log n)
    *  <li>Space complexity:        O(n)
    * </ul>
    */
  public void addNum(int num) {
    this.minHeap.add(num);

    if (this.maxHeap.size() > 0 && this.minHeap.peek() > this.maxHeap.peek()) {
      this.maxHeap.add(this.minHeap.poll());
      this.minHeap.add(this.maxHeap.poll());
    }

    if (this.minHeap.size() > this.maxHeap.size() + 1) {
      this.maxHeap.add(this.minHeap.poll());
    }

    if (this.maxHeap.size() > this.minHeap.size() + 1) {
      this.minHeap.add(this.maxHeap.poll());
    }
  }

  /**
    * Find median.
    * <ul>
    *  <li>Average time complexity: O(1)
    *  <li>Worst time complexity:   O(1)
    *  <li>Space complexity:        O(1)
    * </ul>
    *
    * @return challenge answer.
    */
  public double findMedian() {
    if (this.minHeap.size() == this.maxHeap.size()) {
      return (this.minHeap.peek() + this.maxHeap.peek()) / 2.0;
    }

    return this.minHeap.size() > this.maxHeap.size()
      ? this.minHeap.peek()
      : this.maxHeap.peek();
  }
}
