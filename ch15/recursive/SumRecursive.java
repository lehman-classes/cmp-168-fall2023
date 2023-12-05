class SumRecursive {

  public static int add(int a, int b) {
    if (a == 0) {
      return b;
    } else {
      return add(a - 1, b + 1);
    }
  }

  public static void main(String[] args) {

    System.out.println(add(3, 2));

  }
}
