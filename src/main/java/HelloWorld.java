/**
 * Hello world
 *
 */

public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello world from the outside!");
  }

  public static void greet(String name) {
      System.out.println(String.format("Hello %s!", name));
  }

}
