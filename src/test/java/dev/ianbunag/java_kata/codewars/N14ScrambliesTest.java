package dev.ianbunag.java_kata.codewars;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class N14ScrambliesTest {
  private static void testing(boolean actual, boolean expected) {
    assertEquals(expected, actual);
  }

  @Test @Order(1)
  public void sampleTests() {
    testing(N14Scramblies.scramble("rkqodlw","world"), true);
    testing(N14Scramblies.scramble("cedewaraaossoqqyt","codewars"),true);
    testing(N14Scramblies.scramble("katas","steak"),false);
    testing(N14Scramblies.scramble("scriptjavx","javascript"),false);
    testing(N14Scramblies.scramble("scriptingjava","javascript"),true);
    testing(N14Scramblies.scramble("scriptsjava","javascripts"),true);
    testing(N14Scramblies.scramble("javscripts","javascript"),false);
    testing(N14Scramblies.scramble("aabbcamaomsccdd","commas"),true);
    testing(N14Scramblies.scramble("commas","commas"),true);
    testing(N14Scramblies.scramble("sammoc","commas"),true);
  }

  @Test @Order(2)
  public void largeTest() {
    String s1 = "abcdefghijklmnopqrstuvwxyz".repeat(10_000);
    String s2 = "zyxcba".repeat(9_000);

    testing(N14Scramblies.scramble(s1, s2), true);
  }
}
