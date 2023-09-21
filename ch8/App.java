// this class is the main class of the project
class App {

  public static void main(String[] args) {

    Car car = new Car();
    System.out.println(car.toString());

    // let's create a super hero
    SuperHero superman = new SuperHero("Superman", 30, "fly", "Clark Kent");
    System.out.println(superman.toString());

    // let's create another super hero
    SuperHero batman = new SuperHero("Batman", 40, "intelligence", "Bruce Wayne");
    System.out.println(batman.toString());

    // let's create another super hero
    SuperHero wonderWoman = new SuperHero("Wonderwoman", 25, "strength", "Diana Prince");

    // SuperHero noName = new SuperHero();
    // noName.superPower();
    // System.out.println(noName.getClass());

    // the variables superman and batman are called reference variables
    // because they are referring to the objects of the class SuperHero

    // the objects superman and batman are called instances of the class SuperHero

    // this is the things that susetName(String name) : void

    superman.fly();

    // this is the things that batman can do
    batman.run();

    // print super power of superman
    superman.superPower();

    // print super power of batman
    batman.superPower();

    // superman.realName = "Hendrix";
    // superman.setRealName("Hendrix");

    System.out.println("Superman's real name is " + superman.getRealName());

    System.out.println("Superman name: " + superman.getName());
    System.out.println("Batman name: " + batman.getName());

    int numValue = 999;
    superman.dummyMethodToTestPrimitiveTypePassing(numValue);
    System.out.println("numValue: " + numValue);

    System.out.println("1-Batman name: " + batman.getName());
    superman.dummyMethodToTestReferenceTypePassing(batman);
    System.out.println("2-Batman name: " + batman.getName());

    SuperHero.SUPER_HERO_COUNT = 3;
    System.out.println("Super hero count: " + SuperHero.SUPER_HERO_COUNT);

    superman.SUPER_HERO_COUNT = 4;
    System.out.println("1.Super hero count: " + superman.SUPER_HERO_COUNT);
    System.out.println("2.Super hero count: " + SuperHero.SUPER_HERO_COUNT);
    System.out.println("3.Super hero count: " + batman.SUPER_HERO_COUNT);

    SuperHero.staticMethod();
    batman.staticMethod();

    Dog dog = new Dog();
    dog.setAgeInDogYears(10000);
  }
}
