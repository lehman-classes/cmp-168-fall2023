class Variables {

  public static void main(String[] args) {
    int a = Integer.MAX_VALUE + Integer.MAX_VALUE - 1;
    long b = Long.MAX_VALUE;

    String num = String.valueOf(a);

    System.out.println(num.charAt(1));
  }
}
