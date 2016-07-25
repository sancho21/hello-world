package hello.git;

public class HelloWorld {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Required one argument");
      System.exit(1);
    }

    System.out.println("Hello World! " + args[0]);
  }
}
