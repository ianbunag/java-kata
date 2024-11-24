package dev.ianbunag.java_kata.standalone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Challenge tests.
 */
public class N10SelfReferentialTest {
    @Test
    public void testIsSelfReferential() throws Exception {
        assertEquals(0, N10SelfReferential.isSelfReferential(new int[]{2, 0, 0}));
        assertEquals(0, N10SelfReferential.isSelfReferential(new int[]{0}));
        assertEquals(0, N10SelfReferential.isSelfReferential(new int[]{1}));
        assertEquals(1, N10SelfReferential.isSelfReferential(new int[]{1, 2, 1, 0}));
        assertEquals(1, N10SelfReferential.isSelfReferential(new int[]{2, 0, 2, 0}));
        assertEquals(1, N10SelfReferential.isSelfReferential(new int[]{2, 1, 2, 0, 0}));
        assertEquals(1, N10SelfReferential.isSelfReferential(new int[]{3, 2, 1, 1, 0, 0, 0}));
        assertEquals(1, N10SelfReferential.isSelfReferential(new int[]{4, 2, 1, 0, 1, 0, 0, 0}));
        assertEquals(1, N10SelfReferential.isSelfReferential(new int[]{5, 2, 1, 0, 0, 1, 0, 0, 0}));
        assertEquals(1, N10SelfReferential.isSelfReferential(new int[]{6, 2, 1, 0, 0, 0, 1, 0, 0, 0}));
        assertEquals(0, N10SelfReferential.isSelfReferential(null));
        assertEquals(0, N10SelfReferential.isSelfReferential(new int[]{1, 2, 1, 0, 0}));
        assertEquals(0, N10SelfReferential.isSelfReferential(new int[]{2, 2, 1, 0, 0}));
    }
}
