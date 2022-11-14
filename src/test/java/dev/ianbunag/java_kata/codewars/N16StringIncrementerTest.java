package dev.ianbunag.java_kata.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class N16StringIncrementerTest {
  private static void doTest(String str, String expected) {
    assertEquals(expected, N16StringIncrementer.incrementString(str), "input: <"+str+">");
  }

  @Test
  public void testChallenge() throws Exception {
    doTest("", "1");
    doTest("foo", "foo1");
    doTest("foo1", "foo2");
    doTest("foo9", "foo10");
    doTest("foobar000", "foobar001");
    doTest("foobar001", "foobar002");
    doTest("foobar99", "foobar100");
    doTest("foobar099", "foobar100");
    doTest("49211981343391246250881007325090", "49211981343391246250881007325091");
  }
}
