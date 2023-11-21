class App {

  class Person {
    String name;

    Person(String name) {
      this.name = name;
    }

    public String getName() {
      return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

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

  }
}
