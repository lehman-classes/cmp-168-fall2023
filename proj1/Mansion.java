class Mansion extends House {
  private int id;

  public Mansion() {
    id = 7;
  }

  public void checkHouse(House house) {
    if (house instanceof Mansion) {
      Mansion mansion = (Mansion) house;
      System.out.println("Mansion id: " + mansion.id);
    }

  }
}
