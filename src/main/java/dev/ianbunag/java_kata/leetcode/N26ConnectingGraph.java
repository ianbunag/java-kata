package dev.ianbunag.java_kata.leetcode;

import java.util.function.Function;

/**
 * Challenge solution.
 */
public class N26ConnectingGraph {
  /**
    * Challenge answer with union find algorithm.
    *
    * <ul>
    *  <li>Average time complexity: O(n)
    *  <li>Worst time complexity:   O(n)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  public int countComponents(int number, int[][] edges) {
    var parents = new int[number];
    var ranks = new int[number];
    var count = number;

    Function<Integer, Integer> getParent = (Integer child) -> {
      var parent = child;

      while (parent != parents[parent]) {
        // Path compression
        parents[parent] = parents[parents[parent]];
        parent = parents[parent];
      }

      return parent;
    };

    for (var edge = 0; edge < number; edge += 1) {
      parents[edge] = edge;
      ranks[edge] = 1;
    }

    for (var edge : edges) {
      var first = getParent.apply(edge[0]);
      var second = getParent.apply(edge[1]);

      if (first == second) {
        continue;
      }

      if (ranks[first] > ranks[second]) {
        parents[second] = first;
        ranks[first] += ranks[second];
      } else {
        parents[first] = second;
        ranks[second] += ranks[first];
      }

      count -= 1;
    }

    return count;
  }
}
