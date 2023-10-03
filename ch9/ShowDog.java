class ShowDog extends Dog {
  private int numTrophies;
  private String bestFeature;

  ShowDog() {
    super("Show Dog Doe");
  }

  ShowDog(String name) {
    super(name);
  }

  ShowDog(int numTrophies, String bestFeature) {
    this.numTrophies = numTrophies;
    this.bestFeature = bestFeature;
  }

  ShowDog(String name, double weight, double height, boolean isVac, int age, int numTrophies, String bestFeature) {
    super(name, weight, height, isVac, age);
    this.numTrophies = numTrophies;
    this.bestFeature = bestFeature;
  }

  public int getNumTrophies() {
    return numTrophies;
  }

  public void setNumTrophies(int numTrophies) {
    this.numTrophies = numTrophies;
  }

  public String getBestFeature() {
    return bestFeature;
  }

  public void setBestFeature(String bestFeature) {
    this.bestFeature = bestFeature;
  }

  public void addTrophy() {
    numTrophies++;
  }

  protected boolean isValid(int val) {
    return val >= 0;
  }

  public String toString() {
    return super.toString() + "\nShowDog [numTrophies=" + numTrophies + ", bestFeature=" + bestFeature + "]";
  }

  public boolean equals(Object ob) {
    return super.equals(ob) && ob instanceof ShowDog && numTrophies == ((ShowDog) ob).numTrophies
        && bestFeature.equals(((ShowDog) ob).bestFeature);

  }
}
