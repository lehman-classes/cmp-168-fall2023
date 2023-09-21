class Cat extends Animal {
  private int numWhiskers;
  private double whiskerLength;

  Cat() {
  }

  // getters
  public int getNumWhiskers() {
    return numWhiskers;
  }

  public double getWhiskerLength() {
    return whiskerLength;
  }

  // setters
  public void setNumWhiskers(int numWhiskers) {
    this.numWhiskers = numWhiskers;
  }

  public void setWhiskerLength(double whiskerLength) {
    this.whiskerLength = whiskerLength;
  }

}
