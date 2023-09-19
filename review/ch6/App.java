import java.util.Scanner;

class App {

  public static void main(String[] args) {

    // methods is an instance of CreatingMethods. An instance is an object.
    CreatingMethods methods = new CreatingMethods();
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter your name: ");
    // String name = sc.nextLine();
    // String greeting = methods.greeting(name);
    // System.out.println(greeting);
    //
    // // calling a method that returns a value
    // String reversed = methods.reverse(name);
    // System.out.println(reversed);
    //
    // // calling a static method
    // int luckyNumber = CreatingMethods.luckyNumber();
    // System.out.println(luckyNumber);
    //
    // // calling a method that does not return a value
    methods.printNum();

    // method scope
    int x = 5;
    methods.passByValue(x);
    System.out.println("x is equal " + x);

    methods.luckyNumber(3);
    methods.luckyNumber("3");
    methods.passObj(methods);
    methods.printNum();

  }
}
