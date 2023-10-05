class App {

  public static void main(final String[] args) {
    Database db = new FirebaseImpl();
    db.connect();

    // MathInterface math = new MathInterface();
    final Calculator calc = new Calculator();

    db.insert(calc);

    System.out.println(calc.add(1, 2));
    System.out.println(calc.format("hello"));
    System.out.println(MathInterface.PI);

    calc.setRating(5);

    final Calculator calc2 = new Calculator();
    calc2.setRating(9);

    System.out.println(calc.compareTo(calc2));
    if(calc.compareTo(calc2) > 0) {
      System.out.println("calc is better");
    } else {
      System.out.println("calc2 is better");
    }

    db.disconnect();
  }
}
