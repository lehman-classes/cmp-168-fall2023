class CreatingMethods {

  private int num = 7;

  private int anotherNum = 10;

  // overloaded methods
  public static int luckyNumber() {
    return (int) (Math.random() * 100) + 1;
  }

  public static int luckyNumber(String a) {

    System.out.println("String version of luckyNumber called");
    return Integer.parseInt(a);

  }

  // static methods can be overloaded
  public static int luckyNumber(int num) {
    System.out.println("int version of luckyNumber called");
    return num;
  }

  // static methods do not have access to instance variables
  public static int luckyNumber(int num1, int num2) {
    // not allowed - num is an instance variable
    // return num1 + num2 * num;
    return num1 + num2;
  }

  // static methods do not have access to instance methods
  public static int luckyNumber(int num1, int num2, int num3) {
    // not allowed - greeting is an instance method
    // return num1 + num2 * greeting("Bob");
    return num1 + num2;
  }

  // keyword void means method does not return a value
  public void printNum() {
    System.out.println(num);
  }

  public String reverse(String str) {
    String reversed = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reversed += str.charAt(i);
    }
    return reversed;
  }

  public String greeting(String name) {
    return "Hello " + name;
  }

  // method scope
  public void passByValue(int param) {
    param = 10;
  }

  public void passObj(CreatingMethods obj) {
    obj = null;
  }
}
