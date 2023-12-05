class Exercise3 {

  public void countToZero(int start) {
    if(start == 0) {
      System.out.println("Hooray!");
    } else {
      System.out.println(start);
      start = start < 0 ? start + 1 : start - 1;
      countToZero(start);
      // if(start < 0) {
        // countToZero(start + 1);
      // } else {
      //   countToZero(start - 1);
      // }
    }
  }


  public static void main(String[] args) {

    Exercise3 ex = new Exercise3();
    ex.countToZero(0);

    System.exit(0);

  }
}
