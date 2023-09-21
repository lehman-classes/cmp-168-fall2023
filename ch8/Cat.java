class Cat {
  private int numWhiskers;
  private double whiskerLength;
  private int age;
  private boolean isVaccinated;
  private String name;

  Cat() {
  }

  // getters
  public int getNumWhiskers() {
    return numWhiskers;
  }

  public double getWhiskerLength() {
    return whiskerLength;
  }

  public int getAge() {
    return age;
  }

  public boolean getIsVaccinated() {
    return isVaccinated;
  }

  public String getName() {
    return name;
  }

  // setters
  public void setNumWhiskers(int numWhiskers) {
    this.numWhiskers = numWhiskers;
  }

  public void setWhiskerLength(double whiskerLength) {
    this.whiskerLength = whiskerLength;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setIsVaccinated(boolean isVaccinated) {
    this.isVaccinated = isVaccinated;
  }

  public void setName(String name) {
    this.name = name;
  }
}
