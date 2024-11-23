package dev.ianbunag.java_kata.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Challenge solution.
 */
public class N42UniqueEmailAddresses {
    /**
     * Challenge solution.
     * <ul>
     *  <li>Average time complexity: O(n * m)
     *  <li>Worst time complexity:   O(n * m)
     *  <li>Space complexity:        O(n * m)
     * </ul>
     *
     * @return challenge answer.
     */
    public int numUniqueEmails(String[] emails) {
        return (int) Arrays.stream(emails)
                .map(removeDotsFromLocal)
                .map(removePlusFromLocal)
                .filter(isValidEmail)
                .filter(isUniqueEmail.get())
                .count();
    };

    final static int DOT_ASCII = (int) '.';

    final protected static UnaryOperator<String> removeDotsFromLocal = (email) -> {
        var parts = email.split("@");
        var local = parts[0];
        var domain = parts[1];
        var localWithoutDots = local
                .chars()
                .filter(value -> value != DOT_ASCII)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return localWithoutDots + "@" + domain;
    };

    final protected static UnaryOperator<String> removePlusFromLocal = (email) -> {
        var parts = email.split("@");
        var local = parts[0];
        var domain = parts[1];
        var localParts = local.split("\\+");
        var localWithoutPlus = localParts.length > 0 ? localParts[0] : "";

        return localWithoutPlus + "@" + domain;
    };


    final protected static Predicate<String> isValidEmail = (email) -> {
        var parts = email.split("@");
        var local = parts[0];
        var domain = parts[1];
        var domainParts = Arrays.stream(domain.split("\\.")).filter(Predicate.not(String::isEmpty));

        return !local.isEmpty() && domainParts.count() > 1;
    };

    final protected static Supplier<Predicate<String>> isUniqueEmail = () -> {
        var existingEmails = new HashSet<String>();

        return existingEmails::add;
    };
}
