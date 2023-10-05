import java.util.Scanner;

class App {

  private static boolean validateInput(int input) {
    // input must be the numbers 1 through 5
    // input must be a number
    // input must be an integer
    // input must be a whole number
    // input must be a positive number
    // input must be a non-negative number
    // input must be a non-zero number
    // input must be a non-null number
    // input must be a non-empty number
    // input must be a non-blank number
    // input must be a non-whitespace number
    // input must be a non-alphanumeric number
    if (input < 1 || input > 5) {
      System.out.println("Invalid input. Please try again.");
      return false;
    }

    return true;
  }

  public static void displayMenu() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("Select from the following options: ");
    System.out.println("1. Add a new contact");
    System.out.println("2. Search for a contact");
    System.out.println("3. Delete a contact");
    System.out.println("4. Display all contacts");
    System.out.println("5. Exit");
  }

  public static void main(String[] args) {
    displayMenu();

    // Get user input
    Scanner scanner = new Scanner(System.in);
    int option = scanner.nextInt();
    while (true) {
      if (validateInput(option)) {
        switch (option) {
          case 1:
            System.out.println("Add a new contact");
            break;
          case 2:
            System.out.println("Search for a contact");
            break;
          case 3:
            System.out.println("Delete a contact");
            break;
          case 4:
            System.out.println("Display all contacts");
            break;
          case 5:
            System.out.println("Exit");
            return;
          default:
            System.out.println("Invalid input. Please try again.");
        }
      }
      scanner.next();
      displayMenu();
      option = scanner.nextInt();
    }

  }
}
