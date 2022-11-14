package dev.ianbunag.java_kata.codewars;

/**
 * Challenge solution.
 */
public class N6HumanReadableDuration {
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
   * <ul>
   *  <li>Average time complexity: O(1)
   *  <li>Worst time complexity:   O(1)
   *  <li>Space complexity:        O(1)
   * </ul>
   *
   * @param seconds Duration in seconds.
   * @return Formatted duration.
   */
  public static String formatDuration(int seconds) {
    if (seconds == 0) {
      return N6HumanReadableDuration.NOW;
    }

    var readableDuration = "";
    var remainingSeconds = seconds;
    var numberOfDurations = N6HumanReadableDuration.DURATIONS.length;

    for (var ctr = 0; ctr < numberOfDurations && remainingSeconds > 0; ctr += 1) {
      var duration = N6HumanReadableDuration.DURATIONS[ctr];

      if (duration.getSeconds() > remainingSeconds) {
        continue;
      }

      final var quantity = remainingSeconds / duration.getSeconds();
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

  private static class Duration {
    /**
     * Duration name.
     */
    private final String name;
    /**
     * Number of seconds in a duration.
     */
    private final Integer seconds;

    private Duration(String name, Integer seconds) {
      this.name = name;
      this.seconds = seconds;
    }

    public Integer getSeconds() {
      return seconds;
    }

    public String toReadableDuration(Integer quantity) {
      var readableDuration = quantity + " " + name;

      if (quantity > 1) {
        readableDuration += "s";
      }

      return readableDuration;
    }

    public static Duration create(String name, Integer seconds) {
      return new Duration(name, seconds);
    }
  }

}
