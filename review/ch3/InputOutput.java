import java.util.Scanner;

class InputOutput {

  public static void main(String args[]) {

    // input
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    // process
    input = input.toUpperCase();

    // output
    System.out.print(input);

    sc.close();
  }

}
