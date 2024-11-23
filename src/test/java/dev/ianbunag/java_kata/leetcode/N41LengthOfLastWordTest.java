package dev.ianbunag.java_kata.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Challenge tests.
 */
public class N41LengthOfLastWordTest {
    @Test
    public void testLengthOfLastWord() throws Exception {
        var solution = new N41LengthOfLastWord();
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
    }
}
