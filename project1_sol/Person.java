class Person implements Comparable<Person> {
  private String name;
  private int birthYear;

  public Person() {
    this.name = "";
    this.birthYear = 0;
  }

  public Person(String name, int birthYear) {
    this.name = name;
    this.birthYear = birthYear;
  }

  public String getName() {
    return name;
  }

  public int getBirthYear() {
    return birthYear;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person) {
      Person other = (Person) obj;
      return this.name.equals(other.name) && this.birthYear == other.birthYear;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
  }

  @Override
  public int compareTo(Person p) {

    if (this.birthYear > p.birthYear) {
      return 1;
    } else if (this.birthYear < p.birthYear) {
      return -1;
    }
    return 0;
  }

}
