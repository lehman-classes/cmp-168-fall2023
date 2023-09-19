// This class is used to describe a super hero
class SuperHero {
  // what are the things name, age, power, real name
  // properties - instance variables - data members - fields
  private String name;
  private int age;
  private String power;
  private String realName;

  public static int SUPER_HERO_COUNT = 0;

  // one of the super power of classes in Java is that we can hide information.

  // constructor
  // SuperHero() { // default constructor
  // System.out.println("I am a super hero");
  // }

  // constructor overloading
  SuperHero(String name, int age, String power, String realName) {
    // initialize the instance variables
    if (name.equals("Superman")) {
      this.name = "Really is that your name?";
    } else {
      this.name = name;
    }
    // this.name = name;
    this.age = age;
    this.power = power;
    this.realName = realName;
  }

  public void dummyMethodToTestPrimitiveTypePassing(int num) {
    num = 10;
  }

  public void dummyMethodToTestReferenceTypePassing(SuperHero superHero) {
    superHero.name = "Hendrix";
  }

  // getters
  String getName() {
    return name;
  }

  int getAge() {
    return age;
  }

  String getPower() {
    return power;
  }

  String getRealName() {
    return realName;
  }

  // setters
  // void setRealName(String realName) {
  // this.realName = realName;
  // }

  // class methods
  // what are the things that a super hero can do
  void fly() {
    System.out.println("I am flying");
  }

  // super hero can run
  void run() {
    System.out.println("I am running");
  }

  // super hero super power
  void superPower() {
    System.out.printf("%s - I have super power of %s\n", name, power);
  }

  @Override
  public String toString() {
    return String.format("Name: %s, Age: %d, Power: %s, Real Name: %s", name, age, power, realName);
  }

  @Override
  public boolean equals(Object obj) {
    // check if the object is null
    if (obj == null) {
      return false;
    }
    // check if the object is an instance of SuperHero
    if (!(obj instanceof SuperHero)) {
      return false;
    }
    // cast the object to SuperHero
    SuperHero superHero = (SuperHero) obj;
    // check if the name of the super hero is the same
    if (this.name.equals(superHero.name) && this.age == superHero.age) {
      return true;
    }
    return false;
  }

}
