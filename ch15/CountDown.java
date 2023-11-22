class CountDown {

  public static void countDown(int n) {
    if (n == 0) {
      System.out.println("Hooray!");
    } else {
      System.out.println(n);
      countDown(n - 1);
    }
  }

  public static void headCountDown(int n) {
    if (n == 0) {
      System.out.println("Hooray!");
    } else {
      headCountDown(n - 1);
      System.out.println(n);
    }
  }

  public static void countDownIteractive(int n) {
    for (int i = n; i > 0; i--) {
      System.out.println(i);
    }
    System.out.println("Hooray!");
  }

  public static void main(String[] args) {

    // System.out.println("3");
    // System.out.println("2");
    // System.out.println("1");
    // System.out.println("Hooray!");

    // countDownIteractive(10);

    countDown(10);

    headCountDown(10);
  }
}
