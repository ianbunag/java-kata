package dev.ianbunag.java_kata.standalone;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Challenge tests.
 */
public class N4SliceArrayTest {
    @Test
    public void testSliceArray() throws Exception {
        assertArrayEquals(
                null,
                N4SliceArray.sliceArray(new char[]{'a', 'b', 'c'}, 0, 4)
        );
        assertArrayEquals(
                new char[]{'a', 'b', 'c'},
                N4SliceArray.sliceArray(new char[]{'a', 'b', 'c'}, 0, 3)
        );
        assertArrayEquals(
                new char[]{'a', 'b'},
                N4SliceArray.sliceArray(new char[]{'a', 'b', 'c'}, 0, 2)
        );
        assertArrayEquals(
                new char[]{'a'},
                N4SliceArray.sliceArray(new char[]{'a', 'b', 'c'}, 0, 1)
        );
        assertArrayEquals(
                null,
                N4SliceArray.sliceArray(new char[]{'a', 'b', 'c'}, 1, 3)
        );
        assertArrayEquals(
                new char[]{'b', 'c'},
                N4SliceArray.sliceArray(new char[]{'a', 'b', 'c'}, 1, 2)
        );
        assertArrayEquals(
                new char[]{'b'},
                N4SliceArray.sliceArray(new char[]{'a', 'b', 'c'}, 1, 1)
        );
        assertArrayEquals(
                null,
                N4SliceArray.sliceArray(new char[]{'a', 'b', 'c'}, 2, 2)
        );
        assertArrayEquals(
                new char[]{'c'},
                N4SliceArray.sliceArray(new char[]{'a', 'b', 'c'}, 2, 1)
        );
        assertArrayEquals(
                null,
                N4SliceArray.sliceArray(new char[]{'a', 'b', 'c'}, 3, 1)
        );
        assertArrayEquals(
                new char[]{},
                N4SliceArray.sliceArray(new char[]{'a', 'b', 'c'}, 1, 0)
        );
        assertArrayEquals(
                null,
                N4SliceArray.sliceArray(new char[]{'a', 'b', 'c'}, -1, 2)
        );
        assertArrayEquals(
                null,
                N4SliceArray.sliceArray(new char[]{'a', 'b', 'c'}, -1, -2)
        );
        assertArrayEquals(
                null,
                N4SliceArray.sliceArray(new char[]{}, 0, 1)
        );
    }
}
