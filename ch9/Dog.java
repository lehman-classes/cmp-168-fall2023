// The class Animal is the parent class of the class Dog
// The Dog class is the child class of the class Animal
// Therefore, the Dog class inherits all the instance variables and methods from the Animal class
class Dog extends Animal {
  // Instance variables
  private int ageInDogYears;

  // Constructor
  Dog() {
  }

  // getters
  public int getAgeInDogYears() {
    return ageInDogYears;
  }

  // Setters
  public void setAgeInDogYears(int ageInDogYears) {
    this.ageInDogYears = ageInDogYears;
  }
}
