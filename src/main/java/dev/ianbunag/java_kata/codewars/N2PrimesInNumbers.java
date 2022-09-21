package dev.ianbunag.java_kata.codewars;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class N2PrimesInNumbers {
  private N2PrimesInNumbers() { }

  /**
   * Challenge solution.
   *
   * Average time complexity: O(n log n)
   * Worst time complexity:   O(n log n)
   * Space complexity:        O(n)
   *
   * @param number
   * @return Primes in numbers.
   */
  public static String factors(final int number) {
    var primeIterable = new PrimeIterable();
    var primeMap = new TreeMap<Integer, Integer>();
    int difference = number;

    while (difference > 1) {
      if (new BigInteger(String.valueOf(difference)).isProbablePrime(1)) {
        primeMap.put(difference, 1);

        break;
      }

      for (Integer primeNumber: primeIterable) {
        if (primeNumber > 1 && difference % primeNumber == 0) {
          difference /= primeNumber;
          primeMap.merge(primeNumber, 1, Integer::sum);

          break;
        }
      }
    }

    return primeMap.entrySet()
      .stream()
      .map(N2PrimesInNumbers.toFactorDecomposition)
      .collect(Collectors.joining());
  }

  /**
   * Lambda to transform prime map entries to its decomposition.
   */
  private static Function<Entry<Integer, Integer>, String> toFactorDecomposition
    = (entry) -> {
      if (entry.getValue() == 1) {
        return String.format("(%s)", entry.getKey());
      }

      return String.format("(%s**%s)", entry.getKey(), entry.getValue());
    };
}

final class PrimeIterable implements Iterable<Integer> {
  /**
   * Prime numbers list cache.
   */
  private List<Integer> primeList = PrimeIterator.createInitialPrimeList();

  @Override
  public Iterator<Integer> iterator() {
    return new PrimeIterator(primeList);
  }
}

final class PrimeIterator implements Iterator<Integer> {
  /**
   * Reference of prime numbers list to be iterated on.
   */
  private List<Integer> primeList;
  /**
   * Iterator position.
   */
  private int position = -1;

  PrimeIterator(final List<Integer> sourcePrimeList) {
    primeList = sourcePrimeList;
  }

  @Override
  public boolean hasNext() {
    return true;
  }

  @Override
  public Integer next() {
    position += 1;

    if (position > primeList.size() - 1) {
      var previousPrime = primeList.get(position - 1);
      var nextPrime = new BigInteger(String.valueOf(previousPrime))
        .nextProbablePrime()
        .intValue();

      primeList.add(nextPrime);
    }

    return primeList.get(position);
  }

  public static List<Integer> createInitialPrimeList() {
    var primeList = new ArrayList<Integer>();
    primeList.add(1);

    return primeList;
  }
}
