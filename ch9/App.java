class App {

  public static void main(String[] args) {
    // an instance of Dog
    Dog dog = new Dog();
    dog.setName("Rex");
    // System.out.println(dog.getName());
    dog.printName();

    dog.barkAt("the cat");

    System.out.println(dog);
  }
}
