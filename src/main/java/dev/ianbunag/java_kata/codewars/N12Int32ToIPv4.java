package dev.ianbunag.java_kata.codewars;

import java.util.ArrayList;

/**
 * Challenge solution.
 */
public class N12Int32ToIPv4 {
  private N12Int32ToIPv4() { }

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
  public static String longToIP(long longIP) {
    var binary = Long.toBinaryString(longIP);
    var octets = new ArrayList<String>();

    for (var binaryIndex = binary.length() - 1; binaryIndex >= 0; binaryIndex -= 1) {
      var bit = binary.charAt(binaryIndex);

      if (octets.size() == 0 || octets.get(octets.size() - 1).length() > 7) {
        octets.add("");
      }

      octets.set(octets.size() - 1, String.valueOf(bit) + octets.get(octets.size() - 1));
    }

    var ip = "";

    for (var octetIndex = 0; octetIndex < 4; octetIndex += 1) {
      if (octetIndex > 0) {
        ip = "." + ip;
      }

      if (octetIndex > octets.size() - 1) {
        ip = "0" + ip;
        continue;
      }

      ip = Integer.parseInt(octets.get(octetIndex), 2) + ip;
    }

    return ip;
  }
}
