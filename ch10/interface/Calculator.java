class Calculator implements MathInterface, FormatInterface, Comparable<Calculator> {

  private int rating;

  public Calculator() {
    this.rating = 0;
  }

  public int getRating() {
    return this.rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public int add(int a, int b) {
    return a + b;
  }

  public String format(String s) {
    return s.toUpperCase();
  }

  public int compareTo(Calculator other) {
    return this.rating - other.rating;
  }
}
