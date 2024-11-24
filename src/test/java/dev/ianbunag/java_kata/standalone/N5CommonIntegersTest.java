package dev.ianbunag.java_kata.standalone;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Challenge tests.
 */
public class N5CommonIntegersTest {
    @Test
    public void testCommonIntegers() throws Exception {
        assertArrayEquals(
                new int[]{1, 2},
                N5CommonIntegers.commonIntegers(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1})
        );
        assertArrayEquals(
                new int[]{2, 6, 1},
                N5CommonIntegers.commonIntegers(new int[]{1, 8, 3, 2, 6}, new int[]{2, 6, 1})
        );
        assertArrayEquals(
                new int[]{1, 3, 7, 9},
                N5CommonIntegers.commonIntegers(new int[]{1, 3, 7, 9}, new int[]{7, 1, 9, 3})
        );
        assertArrayEquals(
                new int[]{},
                N5CommonIntegers.commonIntegers(new int[]{1, 2}, new int[]{3, 4})
        );
        assertArrayEquals(
                new int[]{},
                N5CommonIntegers.commonIntegers(new int[]{}, new int[]{1, 2, 3})
        );
        assertArrayEquals(
                new int[]{},
                N5CommonIntegers.commonIntegers(new int[]{1, 2}, new int[]{})
        );
        assertNull(N5CommonIntegers.commonIntegers(new int[]{1, 2}, null
        ));
        assertNull(N5CommonIntegers.commonIntegers(new int[]{}, null)
        );
        assertNull(N5CommonIntegers.commonIntegers(null, null)
        );
    }
}
