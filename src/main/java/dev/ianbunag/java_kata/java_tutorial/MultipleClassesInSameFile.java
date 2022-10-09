package dev.ianbunag.java_kata.java_tutorial;

/**
 * Tutorial multiple classes.
 */
public class MultipleClassesInSameFile {
  private MultipleClassesInSameFile() { }

  /**
   * Prints generated messages.
   *
   * @param args CLI arguments.
   */
  public static void main(String[] args) {
    System.out.println(GenerateMessage.generateMessage());
    System.out.println(AnotherMessage.generateAnotherMessage());
  }

  private static class GenerateMessage {
    private GenerateMessage() { }

    static String generateMessage() {
      return "Here is one message";
    }
  }

  private static class AnotherMessage {
    private AnotherMessage() { }

    static String generateAnotherMessage() {
      return "Here is another message";
    }
  }
}
