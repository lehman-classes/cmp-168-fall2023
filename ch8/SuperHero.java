// This class is used to describe a super hero
class SuperHero {
  // what are the things name, age, power, real name
  // properties - instance variables - data members - fields
  private String name;
  private int age;
  private String power;
  private String realName;
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

}
