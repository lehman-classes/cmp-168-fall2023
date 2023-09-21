class Dog {
  // Instance variables
  private String name;
  private double weight;
  private double height;
  private boolean isVaccinated;
  private int ageInDogYears;

  private int magicNumber = 10;

  // Constructor
  Dog() {
  }

  // getters
  public String getName() {
    return name;
  }

  public double getWeight() {
    return weight;
  }

  public double getHeight() {
    return height;
  }

  public boolean getIsVaccinated() {
    return isVaccinated;
  }

  public int getAgeInDogYears() {
    return ageInDogYears;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setIsVaccinated(boolean isVaccinated) {
    this.isVaccinated = isVaccinated;
  }

  public void setAgeInDogYears(int ageInDogYears) {
    this.ageInDogYears = ageInDogYears;
  }
}
