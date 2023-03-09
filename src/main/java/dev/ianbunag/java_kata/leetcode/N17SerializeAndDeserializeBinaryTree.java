package dev.ianbunag.java_kata.leetcode;

import dev.ianbunag.java_kata.lib.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/**
 * Challenge solution.
 */
public class N17SerializeAndDeserializeBinaryTree {
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
  public String serialize(TreeNode root) {
    var serializer = new Serializer();
    var levels = new ArrayList<List<TreeNode>>();
    Supplier<List<TreeNode>> lastLevel = () -> levels.get(levels.size() - 1);
    levels.add(Arrays.asList(new TreeNode[]{root}));

    while (lastLevel.get().size() > 0) {
      var nextLevel = new ArrayList<TreeNode>();

      for (TreeNode node : lastLevel.get()) {
        if (node != null) {
          nextLevel.add(node.left);
          nextLevel.add(node.right);
        }
      }

      levels.add(nextLevel);
    }

    levels.stream()
      .limit(Math.max(levels.size() - 2, 1))
      .flatMap((level) -> level.stream())
        .forEach((node) -> serializer.add(node));

    return serializer.serialize();
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
  public TreeNode deserialize(String data) {
    var nodes = Serializer.deserialize(data);
    var queue = new ArrayList<TreeNode>();
    var root = nodes.remove(0);
    queue.add(root);

    while (nodes.size() > 0) {
      var current = queue.remove(0);

      if (current == null) {
        continue;
      }

      queue.add(current.left = nodes.remove(0));
      queue.add(current.right = nodes.remove(0));
    }

    return root;
  }
}

class Serializer {
  private static final Character POSITIVE_DELIMITER = '+';
  private static final Character NEGATIVE_DELIMITER = '-';
  private static final Character EMPTY_DELIMITER = '_';
  private static final String TOKEN_FORMAT = "%s%s";
  private static final Integer TOKEN_BASE = 36;
  private static final Pattern TOKEN_PATTERN = Pattern.compile("[+\\-_][0-9a-z]+");

  private StringBuilder stringBuilder = new StringBuilder();
  private Integer lastValue = 0;
  private Boolean lastValueIsNull = true;

  public void add(TreeNode node) {
    if (node == null) {
      if (!this.lastValueIsNull) {
        this.flush();
      }

      this.lastValue += 1;
      return;
    }

    this.flush();
    this.lastValue = node.val;
    this.lastValueIsNull = false;
  }

  public String serialize() {
    this.flush();
    return this.stringBuilder.toString();
  }

  private void flush() {
    if (this.lastValue == 0 && this.lastValueIsNull) {
      return;
    }

    if (this.lastValueIsNull) {
      this.stringBuilder.append(
          String.format(
            Serializer.TOKEN_FORMAT,
            Serializer.EMPTY_DELIMITER,
            Integer.toString(this.lastValue, Serializer.TOKEN_BASE)
          )
      );
    } else {
      this.stringBuilder.append(
          String.format(
            Serializer.TOKEN_FORMAT,
            this.lastValue >= 0 ? Serializer.POSITIVE_DELIMITER : Serializer.NEGATIVE_DELIMITER,
            Integer.toString(Math.abs(this.lastValue), Serializer.TOKEN_BASE)
          )
      );
    }

    this.lastValue = 0;
    this.lastValueIsNull = true;
  }

  public static List<TreeNode> deserialize(String serialized) {
    var deserialized = new ArrayList<TreeNode>();
    var matcher = Serializer.TOKEN_PATTERN.matcher(serialized);

    while (matcher.find()) {
      var chunk = matcher.group();
      var delimiter = chunk.charAt(0);
      var value = Integer.parseInt(chunk.substring(1), Serializer.TOKEN_BASE);

      if (delimiter == Serializer.EMPTY_DELIMITER) {
        deserialized.addAll(Collections.nCopies(value, null));
        continue;
      }

      deserialized.add(
        new TreeNode(delimiter == Serializer.NEGATIVE_DELIMITER ? -value : value)
      );
    }

    return deserialized;
  }
}
