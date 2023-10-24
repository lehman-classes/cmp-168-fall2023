class Person {

  private String name;
  private int age;

  public Person() {
    this.name = "John Doe";
    this.age = 0;
  }

  public Person(String name) {
    this.name = name;
    this.age = 0;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Name: %30s | %4d";
  }
}
