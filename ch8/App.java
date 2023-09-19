// this class is the main class of the project
class App {

  public static void main(String[] args) {
    // let's create a super hero
    SuperHero superman = new SuperHero("Superman", 30, "fly", "Clark Kent");

    // let's create another super hero
    SuperHero batman = new SuperHero("Batman", 40, "intelligence", "Bruce Wayne");

    // let's create another super hero
    SuperHero wonderWoman = new SuperHero("Wonderwoman", 25, "strength", "Diana Prince");

    // SuperHero noName = new SuperHero();
    // noName.superPower();
    // System.out.println(noName.getClass());

    // the variables superman and batman are called reference variables
    // because they are referring to the objects of the class SuperHero

    // the objects superman and batman are called instances of the class SuperHero

    // this is the things that superman can do
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

  }
}
