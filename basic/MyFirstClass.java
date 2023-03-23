package basic;

public class MyFirstClass {
  public static void main(String...strings) {
    System.out.println(GenerateMesssage.generateMessage());
    System.out.println(AnotherMessage.anotherMessage());
  }
}

class GenerateMesssage {
  static String generateMessage() {
    return "I'm learning Java";
  }
}

class AnotherMessage {
  static String anotherMessage() {
    return "LOL";
  }
}