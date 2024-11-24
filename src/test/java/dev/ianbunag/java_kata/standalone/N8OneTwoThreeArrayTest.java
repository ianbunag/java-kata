package dev.ianbunag.java_kata.standalone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Challenge tests.
 */
public class N8OneTwoThreeArrayTest {
    @Test
    public void testIsOneTwoThreeArray() throws Exception {
        assertEquals(0, N8OneTwoThreeArray.isOneTwoThreeArray(new int[]{1, 2, 3, 3, 2, 1}));
        assertEquals(0, N8OneTwoThreeArray.isOneTwoThreeArray(new int[]{0, 1, 2, 3, 1, 2, 3}));
        assertEquals(0, N8OneTwoThreeArray.isOneTwoThreeArray(new int[]{1, 2, 3, 3, 2, 1, 1, 2, 3}));
        assertEquals(1, N8OneTwoThreeArray.isOneTwoThreeArray(new int[]{1, 2, 3}));
        assertEquals(0, N8OneTwoThreeArray.isOneTwoThreeArray(new int[]{}));
        assertEquals(0, N8OneTwoThreeArray.isOneTwoThreeArray(null));
        assertEquals(1, N8OneTwoThreeArray.isOneTwoThreeArray(new int[]{1, 2, 3, 1, 2, 3}));
        assertEquals(1, N8OneTwoThreeArray.isOneTwoThreeArray(new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3}));
        assertEquals(0, N8OneTwoThreeArray.isOneTwoThreeArray(new int[]{1, 2, 3, 1, 2, 3, 1, 2, 3, 1}));
    }
}
