import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;

class App {

  public static void main(String[] args) {
    System.out.println("read int input from user");
    Scanner scanner = new Scanner(System.in);
    try {
      int input = scanner.nextInt();
      if (input > 10) {
        System.out.println("number too big");
      }
    } catch (Exception e) {
      System.out.println("EXCEPTION: " + e.getMessage());
    } finally {
      System.out.println("finally");
      if (scanner != null) {
        try {
          scanner.close();
        } catch (Exception e) {
          System.out.println("Something went wrong");
        }
      }
    }
    // NEVER DO THIS

    // Error error = new Error();
    // Exception exception = new Exception();

  }
}
