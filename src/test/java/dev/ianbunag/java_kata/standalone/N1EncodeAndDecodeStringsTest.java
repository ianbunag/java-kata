package dev.ianbunag.java_kata.standalone;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;

import org.junit.Test;

/**
 * Challenge tests.
 */
public class N1EncodeAndDecodeStringsTest {
  @Test
  public void it_should_encode_and_decode_simple_list() throws Exception {
    var solution = new N1EncodeAndDecodeStrings();
    var list = Arrays.asList(new String[]{"lint", "code", "love", "you"});

    assertIterableEquals(list, solution.decode(solution.encode(list)));
  }

  @Test
  public void it_should_encode_and_decode_symbol_list() throws Exception {
    var solution = new N1EncodeAndDecodeStrings();
    var list = Arrays.asList(new String[]{"we", "say", ":", "yes"});

    assertIterableEquals(list, solution.decode(solution.encode(list)));
  }

  @Test
  public void it_should_encode_and_decode_complex_list() throws Exception {
    var solution = new N1EncodeAndDecodeStrings();
    var list = Arrays.asList(new String[]{"we", "", "\\\\:", "say", ":", "yes", "::", "banana"});

    assertIterableEquals(list, solution.decode(solution.encode(list)));
  }
}
