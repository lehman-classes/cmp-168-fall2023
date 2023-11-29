class BinarySearch {

  public static int binarySearch(int[] arr, int target, int start, int end) {
    if (start > end) {
      return -1;
    }
    int mid = (start + end) / 2;
    System.out.println("mid: " + mid);
    if (arr[mid] == target) {
      return mid;
    } else if (arr[mid] > target) {
      return binarySearch(arr, target, start, mid - 1);
    } else {
      return binarySearch(arr, target, mid + 1, end);
    }
  }

  public static void main(String[] args) {

    int[] scores = { 54, 59, 67, 72, 75, 82, 87, 91, 95, 99 };
    int result = binarySearch(scores, 85, 0, scores.length - 1);
    System.out.println(result);
  }
}
