package dev.ianbunag.java_kata.leetcode;

/**
 * Challenge solution.
 */
public class N41LengthOfLastWord {
    /**
     * Challenge solution.
     * <ul>
     *  <li>Average time complexity: O(n)
     *  <li>Worst time complexity:   O(n)
     *  <li>Space complexity:        O(1)
     * </ul>
     *
     * @return challenge answer.
     */
    public int lengthOfLastWord(String s) {
        var length = 0;

        for (int i = s.length() - 1; i >= 0; i -= 1) {
            if (s.charAt(i) == ' ') {
                if (length > 0) {
                    break;
                }

                continue;
            }

            length += 1;
        }

        return length;
    }
}
