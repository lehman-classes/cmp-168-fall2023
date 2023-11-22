class ExponentRecursive {

  public static int exponent(int base, int power) {
    if (power == 0) {
      return 1;
    } else {
      return base * exponent(base, power - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println(exponent(3, 4));
  }
}
