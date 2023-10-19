class House {

  private House[] houses;
  private int housesIndex;
  private Person person;

  public House() {
    housesIndex = 0;
    houses = new House[10];
    person = new Person("New Person");
  }

  public void addHouse(House house) {

    if (housesIndex >= 10) {
      // System.out.println("No more houses can be added");
      return;
    }
    houses[housesIndex] = house;
    housesIndex++;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public Person getPerson() {
    return person;
  }

  public void addHouses(House[] houses) {

    // houses[housesIndex] = houses[housesIndex++];

    for (int i = 0; i < houses.length; i++) {

    }

  }

}
