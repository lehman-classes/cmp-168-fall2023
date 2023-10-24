class Person {

  private String name;
  private String address;
  private int zip;

  public Person(String name, String address, int zip) {
    this.name = name;
    this.address = address;
    this.zip = zip;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public int getZip() {
    return zip;
  }
}
