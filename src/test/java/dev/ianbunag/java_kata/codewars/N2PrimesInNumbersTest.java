package dev.ianbunag.java_kata.codewars;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class N2PrimesInNumbersTest {
  @Test
  public void testChallenge() throws Exception {
    assertEquals(
      "(2**2)(3**3)(5)(7)(11**2)(17)",
      N2PrimesInNumbers.factors(7775460)
    );
    assertEquals(
      "(2**4)(3)(11)(43)(15073)",
      N2PrimesInNumbers.factors(342217392)
    );
    assertEquals(
      "(7)(5113051)",
      N2PrimesInNumbers.factors(35791357)
    );
  }

  @Test
  public void testPrimeIterable() throws Exception {
    var primeIterable = new PrimeIterable();
    var values = new ArrayList<Integer>();
    Integer[] expected = {1, 2, 3, 5, 7, 11, 13, 17, 19};

    for (Integer primeNumber: primeIterable) {
      if (primeNumber > 20) {
        break;
      }

      values.add(primeNumber);
    }

    assertArrayEquals(expected, values.toArray());
  }
}
