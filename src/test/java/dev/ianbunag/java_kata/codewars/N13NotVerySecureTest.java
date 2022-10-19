package dev.ianbunag.java_kata.codewars;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;

public class N13NotVerySecureTest {
  @Test
  @DisplayName("Valid input")
  void testValidInput() {
    assertTrue(N13NotVerySecure.alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
  }

  @DisplayName("Invalid character")
  @ParameterizedTest(name="Should return false for \"{0}\"")
  @ValueSource(strings = {"", "with space", "with_underscore", "punctuation.", "naïve", "１strangedigit", "emoji😊"})
  void testInvalidChars(String input) {
    assertFalse(N13NotVerySecure.alphanumeric(input));
  }
}
