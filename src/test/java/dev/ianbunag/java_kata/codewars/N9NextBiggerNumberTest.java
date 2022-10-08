package dev.ianbunag.java_kata.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class N9NextBiggerNumberTest {
  @Test
  public void testChallenge() throws Exception {
    assertEquals(-1, N9NextBiggerNumber.nextBiggerNumber(1));
    assertEquals(21, N9NextBiggerNumber.nextBiggerNumber(12));
    assertEquals(531, N9NextBiggerNumber.nextBiggerNumber(513));
    assertEquals(2071, N9NextBiggerNumber.nextBiggerNumber(2017));
    assertEquals(441, N9NextBiggerNumber.nextBiggerNumber(414));
    assertEquals(414, N9NextBiggerNumber.nextBiggerNumber(144));
    assertEquals(19009, N9NextBiggerNumber.nextBiggerNumber(10990));
    assertEquals(1202373664, N9NextBiggerNumber.nextBiggerNumber(1202373646));
    assertEquals(1450653878, N9NextBiggerNumber.nextBiggerNumber(1450653788));
    assertEquals(1531310413, N9NextBiggerNumber.nextBiggerNumber(1531310341));
    assertEquals(306285437, N9NextBiggerNumber.nextBiggerNumber(306285374));
    assertEquals(997422385, N9NextBiggerNumber.nextBiggerNumber(997422358));
    assertEquals(2015032691, N9NextBiggerNumber.nextBiggerNumber(2015032619));
    assertEquals(2070628895, N9NextBiggerNumber.nextBiggerNumber(2070628859));
  }
}
