package dev.ianbunag.java_kata.leetcode;

import java.util.function.Function;

/**
 * Challenge solution.
 */
public class N27NumberOfProvinces {
  private static int DISCONNECTED = 0;

  /**
    * Challenge solution.
    * <ul>
    *  <li>Average time complexity: O(n ^ 2)
    *  <li>Worst time complexity:   O(n ^ 2)
    *  <li>Space complexity:        O(n)
    * </ul>
    *
    * @return challenge answer.
    */
  public int findCircleNum(int[][] isConnected) {
    var total = isConnected.length;
    var parents = new int[total];
    var ranks = new int[total];
    var count = total;

    Function<Integer, Integer> getParent = (Integer child) -> {
      var parent = child;

      while (parent != parents[parent]) {
        // Path compression
        parents[parent] = parents[parents[parent]];
        parent = parents[parent];
      }

      return parent;
    };

    for (var city = 0; city < total; city += 1) {
      parents[city] = city;
      ranks[city] = 1;
    }

    for (var city = 0; city < total; city += 1) {
      for (var connectedCity = city; connectedCity < total; connectedCity += 1) {
        if (isConnected[city][connectedCity] == N27NumberOfProvinces.DISCONNECTED) {
          continue;
        }

        var cityParent = getParent.apply(city);
        var connectedCityParent = getParent.apply(connectedCity);

        if (cityParent == connectedCityParent) {
          continue;
        }

        if (ranks[cityParent] > ranks[connectedCityParent]) {
          parents[connectedCityParent] = cityParent;
          ranks[cityParent] += ranks[connectedCityParent];
        } else {
          parents[cityParent] = connectedCityParent;
          ranks[connectedCityParent] += ranks[cityParent];
        }

        count -= 1;
      }
    }

    return count;
  }
}
