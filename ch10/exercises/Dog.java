public class Dog extends Pet {// class declaration

  private static int numDogs = 0;
  private int dogNumber;
  // member variables are used to represent attributes
  private String name;
  private double weight;
  private double height;
  private boolean isVaccinated;
  private int ageInDogYears;

  public Dog() {// default constructor is used to initialize variables to default values
    super();
    numDogs++;
    dogNumber = numDogs;
    name = "doggy Doe";
    weight = 0.0;
    height = 0.0;
    isVaccinated = false;
    ageInDogYears = 0;
  }

  public Dog(String name) {
    this();
    this.name = name;
  }

  public Dog(String name, double weight, double height) {
    this();
    this.name = name;
    this.weight = weight;
    this.height = height;
  }

  public Dog(String name, boolean isVaccinated, int age) {
    this();
    this.name = name;
    this.isVaccinated = isVaccinated;
    ageInDogYears = age;
  }

  // fully overloaded constructor
  public Dog(String name, double weight, double height, boolean isVaccinated, int age) {// fully overloaded constructor
    this();
    numDogs++;
    dogNumber = numDogs;
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.isVaccinated = isVaccinated;
    ageInDogYears = age; // do not need to specify this.ageInDogYears
  }

  public Dog(String name, double weight, double height, boolean isVaccinated, int age, String favFood, String favToy,
      int maintLevel, boolean goesOut) {// fully overloaded constructor
    super(favFood, favToy, maintLevel, goesOut);
    numDogs++;
    dogNumber = numDogs;
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.isVaccinated = isVaccinated;
    ageInDogYears = age; // do not need to specify this.ageInDogYears
  }

  @Override
  public void play() {
    System.out.println("I, " + name + ", will play now.");
  }

  public static int getNumDogs() {
    return numDogs;
  }

  public int getDogNumber() {
    return dogNumber;
  }

  public String getName() {// accessor/getter method
    return name;
  }

  public double getWeight() {// accessor/getter method
    return weight;
  }

  public double getHeight() {// accessor/getter method
    return height;
  }

  public boolean isVaccinated() {// accessor/getter method
    return isVaccinated;
  }

  public int getAgeInDogYears() {// accessor/getter method
    return ageInDogYears;
  }

  public void setName(String name) {// mutator/modifier/setter method
    this.name = name;
  }

  public void setWeight(double weight) {// mutator/modifier/setter method
    this.weight = weight;
  }

  public void setHeight(double height) {// mutator/modifier/setter method
    this.height = height;
  }

  public void setVaccinated(boolean isVaccinated) {// mutator/modifier/setter method
    this.isVaccinated = isVaccinated;
  }

  public void setAgeInDogYears(int ageInDogYears) {// mutator/modifier/setter method
    this.ageInDogYears = ageInDogYears;
  }

  public void speak() { // 5 behavioral method
    System.out.println("woof");
  }

  public void sit() { // 5 behavioral method
    System.out.println("I, " + name + ", will sit now.");
  }

  public void beg() { // 5 behavioral method
    System.out.println("treat for " + name + " woof please");
  }

  public int getAgeConvertedIntoHumanYears() { // 5 behavioral method
    return ageInDogYears * 7;
  }

  public void gainWeight() {
    weight++;
  }

  public void growTaller() {
    height++;
  }

  @Override
  public String toString() {
    String s = "Dog [name=" + name + ", weight=" + weight + ", height=" + height + ", age=" + ageInDogYears;
    s += (isVaccinated) ? "is vaccinated" : "is not vaccinated";
    s += ", dog number=" + dogNumber;
    s += "]";
    s += super.toString();
    return s;
  }

  @Override
  public boolean equals(Object obj) {
    super.equals(obj);
    if (obj == null) {
      return false;
    }
    if (this == obj) {
      return true;
    }
    if (obj instanceof Dog) {
      Dog other = (Dog) obj; // cast other to Dog
      if (ageInDogYears == other.ageInDogYears) {
        if (Math.abs(height - other.height) < 0.5) {// absolute value use accuracy range
          if (Math.abs(weight - other.weight) < 0.5) {// absolute value use accuracy range
            if (isVaccinated == other.isVaccinated) {
              if ((name != null) && (other.name != null)) {// check name not null String
                if (name.equals(other.name)) { // safe to call equals method on name
                  return true;
                }
              }
            }
          }
        }
      }
    }
    return false;
  }

}
