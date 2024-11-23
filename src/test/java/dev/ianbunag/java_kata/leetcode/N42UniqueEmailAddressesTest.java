package dev.ianbunag.java_kata.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Challenge tests.
 */
public class N42UniqueEmailAddressesTest {
    @Test
    public void testNumUniqueEmails() throws Exception {
        var solution = new N42UniqueEmailAddresses();

        assertEquals(2, solution.numUniqueEmails(new String[]{
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
        }));
        assertEquals(3, solution.numUniqueEmails(new String[]{
                "a@leetcode.com",
                "b@leetcode.com",
                "c@leetcode.com"
        }));
    }

    @Test
    public void testExcludePlus() throws Exception {
        assertEquals("test@gmail.com", N42UniqueEmailAddresses.removePlusFromLocal.apply("test@gmail.com"));
        assertEquals("test@gmail.com", N42UniqueEmailAddresses.removePlusFromLocal.apply("test+1@gmail.com"));
        assertEquals("test@gmail.com", N42UniqueEmailAddresses.removePlusFromLocal.apply("test+@gmail.com"));
        assertEquals("@gmail.com", N42UniqueEmailAddresses.removePlusFromLocal.apply("+@gmail.com"));
        assertEquals("@gmail.com", N42UniqueEmailAddresses.removePlusFromLocal.apply("+1@gmail.com"));
    }

    @Test
    public void testRemoveLocalDots() throws Exception {
        assertEquals("test@gmail.com", N42UniqueEmailAddresses.removeDotsFromLocal.apply("test@gmail.com"));
        assertEquals("test@gmail.com", N42UniqueEmailAddresses.removeDotsFromLocal.apply("te.st@gmail.com"));
        assertEquals("@gmail.com", N42UniqueEmailAddresses.removeDotsFromLocal.apply(".@gmail.com"));
    }

    @Test
    public void testIsValidEmail() throws Exception {
        assertTrue(N42UniqueEmailAddresses.isValidEmail.test("test@gmail.com"));
        assertFalse(N42UniqueEmailAddresses.isValidEmail.test("test@.com"));
        assertFalse(N42UniqueEmailAddresses.isValidEmail.test("@.com"));
    }
}
