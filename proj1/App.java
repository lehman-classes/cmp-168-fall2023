import java.util.Scanner;

class App {

  private House[] houses = new House[10];
  private Person[] people = new Person[10];

  public void setHouses(House[] houses) {
    this.houses = houses;
  }

  public void setPeople(Person[] people) {
    this.people = people;
  }

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
    System.out.println("1. List Houses");
    System.out.println("2. List People");
    System.out.println("3. Delete a contact");
    System.out.println("4. Display all contacts");
    System.out.println("5. Exit");
  }

  public static void main(String[] args) {

    App app = new App();

    House[] houses = { new House(), new House(), new House() };
    Person[] people = { new Person("Thing One"), new Person("Thing Two"), new Person("Thing Three") };

    displayMenu();

    // Get user input
    Scanner scanner = new Scanner(System.in);
    int option = scanner.nextInt();
    while (true) {
      if (validateInput(option)) {
        switch (option) {
          case 1:
            System.out.println("List Houses");

            for (int i = 0; i < houses.length; i++) {
              System.out.println(i + 1 + ". " + houses[i]);
            }

            int selection = scanner.nextInt();
            System.out.println("You selected: " + houses[selection - 1]);

            break;
          case 2:
            System.out.println("List People");
            for (Person person : people) {
              System.out.println(person);
            }
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
