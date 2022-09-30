package dev.ianbunag.java_kata.codewars;

import org.junit.Test;
import static org.junit.Assert.*;

public class N6HumanReadableDurationTest {
  @Test
  public void testChallenge() throws Exception {
    assertEquals("1 second", N6HumanReadableDuration.formatDuration(1));
    assertEquals("1 minute and 2 seconds", N6HumanReadableDuration.formatDuration(62));
    assertEquals("2 minutes", N6HumanReadableDuration.formatDuration(120));
    assertEquals("1 hour", N6HumanReadableDuration.formatDuration(3600));
    assertEquals("1 hour, 1 minute and 2 seconds", N6HumanReadableDuration.formatDuration(3662));
  }
}
