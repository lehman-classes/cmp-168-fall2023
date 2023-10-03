// The class Animal is the parent class of the class Dog
// The Dog class is the child class of the class Animal
// Therefore, the Dog class inherits all the instance variables and methods from the Animal class
class Dog extends Animal {
  // Instance variables
  private int ageInDogYears;

  // Constructor
  Dog() {
    super("New Dog");
    System.out.println("A new dog has been created!");
    System.out.println("name: " + getName());
  }

  Dog(String name) {
    super(name);
    System.out.println("A new dog has been created!");
    System.out.println("name: " + getName());
  }

  Dog(String name, double weight, double height, boolean isVac, int age) {
    super(name, weight, height, isVac, age);
    System.out.println("A new dog has been created!");
    System.out.println("name: " + getName());
  }

  public void barkAt(String name) {
    super.barkAt(name);
    // System.out.println("CHILD: The dog barks at " + name);
  }

  // getters
  public int getAgeInDogYears() {
    return ageInDogYears;
  }

  // Setters
  public void setAgeInDogYears(int ageInDogYears) {
    this.ageInDogYears = ageInDogYears;
  }

  public void printName() {
    System.out.println("The dog's name is " + getName());
  }

  // Overriding the method from the parent class
  // public String toString() {
  // super.toString();
  // return "toString(): - Dog: " + getName();
  // }

  // public class DogLeg {
  // private int length;
  //
  // public DogLeg(int length) {
  // this.length = length;
  // }
  //
  // public int getLength() {
  // return length;
  // }
  //
  // public void setLength(int length) {
  // this.length = length;
  // }
  // }
}
