package dev.ianbunag.java_kata.java_tutorial;

public final class MultipleClassesInSameFile {
  private MultipleClassesInSameFile() { }

  /**
   * Prints generated messages.
   * @param args
   */
  public static void main(final String[] args) {
      System.out.println(GenerateMessage.generateMessage());
      System.out.println(AnotherMessage.generateAnotherMessage());
  }
}

final class GenerateMessage {
  private GenerateMessage() { }

  static String generateMessage() {
      return "Here is one message";
  }
}

final class AnotherMessage {
  private AnotherMessage() { }

  static String generateAnotherMessage() {
      return "Here is another message";
  }
}
