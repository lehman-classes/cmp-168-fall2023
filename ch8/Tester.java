class Tester {

  public static void main(String[] args) {

    Dog dog1 = new Dog();
    Dog dog2 = new Dog();
    Dog dog3 = new Dog();

    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Cat cat3 = new Cat();

    dog1.setName("Fido");
    dog2.setName("Rex");
    dog3.setName("Spot");

    cat1.setName("Fluffy");
    cat2.setName("Mittens");
    cat3.setName("Snowball");

    dog1.setWeight(10.0);
    dog2.setWeight(20.0);
    dog1.setHeight(2.0);
    dog2.setHeight(3.0);
    dog3.setWeight(15.0);
    dog3.setHeight(2.5);

    cat1.setNumWhiskers(10);
    cat2.setNumWhiskers(12);
    cat1.setWhiskerLength(3.0);
    cat2.setWhiskerLength(4.0);
    cat3.setNumWhiskers(8);
    cat3.setWhiskerLength(2.0);

    System.out.printf("%s weighs %.2f lbs and is %.2f feet tall.\n", dog1.getName(), dog1.getWeight(),
        dog1.getHeight());
    System.out.printf("%s weighs %.2f lbs and is %.2f feet tall.\n", dog2.getName(), dog2.getWeight(),
        dog2.getHeight());
    System.out.printf("%s weighs %.2f lbs and is %.2f feet tall.\n", dog3.getName(), dog3.getWeight(),
        dog3.getHeight());

    System.out.printf("%s has %d whiskers and each whisker is %.2f inches long.\n", cat1.getName(),
        cat1.getNumWhiskers(),
        cat1.getWhiskerLength());
    System.out.printf("%s has %d whiskers and each whisker is %.2f inches long.\n", cat2.getName(),
        cat2.getNumWhiskers(),
        cat2.getWhiskerLength());
    System.out.printf("%s has %d whiskers and each whisker is %.2f inches long.\n", cat3.getName(),
        cat3.getNumWhiskers(),
        cat3.getWhiskerLength());

    if (dog1.getName().equals("Fido")) {
      System.out.println("SUCCESS: Fido is a good name for a dog!");
    } else {
      System.out.println("FAIL:");
    }

  }
}
