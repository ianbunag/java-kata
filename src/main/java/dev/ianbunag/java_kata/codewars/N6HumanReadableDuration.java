package dev.ianbunag.java_kata.codewars;

public final class N6HumanReadableDuration {
  private N6HumanReadableDuration() { }

  /**
   * Duration name and seconds records.
   */
  private static final Duration[] DURATIONS = {
    Duration.create("year", 31_536_000),
    Duration.create("day", 86_400),
    Duration.create("hour", 3_600),
    Duration.create("minute", 60),
    Duration.create("second", 1),
  };

  /**
   * Name for now.
   */
  private static final String NOW = "now";
  /**
   * Comma separator between durations.
   */
  private static final String COMMA = ", ";
  /**
   * And separator between durations.
   */
  private static final String AND = " and ";

  /**
   * Challenge solution. Time complexities are 1 as the Durations list has fixed
   *  length.
   *
   * Average time complexity: O(1)
   * Worst time complexity:   O(1)
   * Space complexity:        O(1)
   *
   * @param seconds
   * @return formatted duration.
   */
  public static String formatDuration(final int seconds) {
    if (seconds == 0) {
      return N6HumanReadableDuration.NOW;
    }

    var readableDuration = "";
    var remainingSeconds = seconds;

    for (
      var ctr = 0;
      ctr < N6HumanReadableDuration.DURATIONS.length && remainingSeconds > 0;
      ctr += 1
    ) {
      var duration = N6HumanReadableDuration.DURATIONS[ctr];

      if (duration.getSeconds() > remainingSeconds) {
        continue;
      }

      var quantity = remainingSeconds / duration.getSeconds();
      remainingSeconds = remainingSeconds % duration.getSeconds();

      if (readableDuration != "" && remainingSeconds > 0) {
        readableDuration += N6HumanReadableDuration.COMMA;
      }
      if (readableDuration != "" && remainingSeconds == 0) {
        readableDuration += N6HumanReadableDuration.AND;
      }

      readableDuration += duration.toReadableDuration(quantity);
    }

    return readableDuration;
  }
}

final class Duration {
  /**
   * Duration name.
   */
  private final String name;
  /**
   * Number of seconds in a duration.
   */
  private final Integer seconds;

  private Duration(final String name, final Integer seconds) {
    this.name = name;
    this.seconds = seconds;
  }

  public String getName() {
    return name;
  }

  public Integer getSeconds() {
    return seconds;
  }

  public String toReadableDuration(final Integer quantity) {
    var readableDuration = quantity + " " + name;

    if (quantity > 1) {
      readableDuration += "s";
    }

    return readableDuration;
  }

  public static Duration create(final String name, final Integer seconds) {
    return new Duration(name, seconds);
  }
}

