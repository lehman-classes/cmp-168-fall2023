class LinearSearch {

  public static int linearSearch(int[] array, int target, int currentIndex) {
    if (currentIndex < 0 || currentIndex >= array.length) {
      return -1;
    } else if (array[currentIndex] == target) {
      return currentIndex;
    } else {
      return linearSearch(array, target, currentIndex + 1);
    }
  }

  public static void main(String[] args) {
    int[] scores = { 82, 87, 75, 99, 91, 95, 72, 54 };
    int result = linearSearch(scores, 99, 0);
    System.out.println(result);
  }
}
