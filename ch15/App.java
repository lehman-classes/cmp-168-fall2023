class App {

  public static void printHello(String name) {
    name = "Jane";
    System.out.printf("Hello, %s\n", name);
  }

  public static void printHello(Person person) {
    person.setName("Jane");
    System.out.printf("Hello, %s\n", person.getName());
  }

  public static int add(int a, int b) {
    a = 10;
    b = 20;
    int total = a + b;
    return total;
  }

  public static int recursive(int n) {
    if (n == 0) {
      return 0;
    }
    System.out.printf("n: %d\n", n);
    return n + recursive(n - 1);
  }

  public static int iterative(int n) {
    int total = 0;
    for (int i = n; i > 0; i--) {
      System.out.printf("i: %d\n", i);
      total += i;
    }
    return total;
  }

  public static void recursive(String name) {
    if (name.isEmpty()) {
      return;
    }
    System.out.printf("name: %s\n", name);
    name = name.substring(0, name.length() - 1);
    recursive(name);
  }

  public static void main(String[] args) {

    String name = "John";
    System.out.printf("BEFORE\t- name: %s\n", name);
    printHello(name);
    System.out.printf("AFTER\t- name: %s\n", name);

    Person person = new Person("John");
    System.out.printf("BEFORE\t- person.getName(): %s\n", person.getName());
    printHello(person);
    System.out.printf("AFTER\t- person.getName(): %s\n", person.getName());

    int a = 1;
    int b = 2;
    System.out.printf("BEFORE\t- a: %d, b: %d\n", a, b);
    int sum = add(a, b);
    System.out.printf("AFTER\t- a: %d, b: %d\n", a, b);

    int result = recursive(10);
    System.out.printf("result: %d\n", result);

    recursive("John");

    int result2 = iterative(10);
    System.out.printf("result2: %d\n", result2);

  }
}
