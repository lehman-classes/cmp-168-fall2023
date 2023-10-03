class Animal {

  private String name;
  private int age;
  private double weight;
  private double height;
  private boolean isVaccinated;

  public void barkAt(String name) {
    System.out.println("PARENT: The dog barks at " + name);
  }

  // Constructor
  Animal() {
    System.out.println("A new animal has been created!");
  }

  Animal(String name) {
    this();
    this.name = name;
  }

  Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  Animal(String name, double weight, double height, boolean isVac, int age) {
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.isVaccinated = isVac;
    this.age = age;
  }

  // getters
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
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

  // setters
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
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

}
