package dev.ianbunag.java_kata.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Challenge solution.
 */
public class N24CloneGraph {
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
  public Node cloneGraph(Node node) {
    return this.cloneGraph(node, new HashMap<>());
  }

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
  public Node cloneGraph(Node node, HashMap<Node, Node> cache) {
    if (node == null) {
      return node;
    }

    if (!cache.containsKey(node)) {
      var copy = new Node(node.val);

      // Store cloned node in cache to handle back-references from its neighbors.
      cache.put(node, copy);

      copy.neighbors = node.neighbors
        .stream()
        .map((source) -> this.cloneGraph(source, cache))
        .collect(Collectors.toCollection(ArrayList::new));
    }

    return cache.get(node);
  }
}

// Definition for a Node.
class Node {
  public int val;
  public List<Node> neighbors;

  public Node() {
    this.val = 0;
    this.neighbors = new ArrayList<Node>();
  }

  public Node(int val) {
    this.val = val;
    this.neighbors = new ArrayList<Node>();
  }

  public Node(int val, ArrayList<Node> neighbors) {
    this.val = val;
    this.neighbors = neighbors;
  }
}
