class BinarySearchExample {


  public static int binarySearch(String target, String[] names) {
    // non-recursive
    int low = 0;
    int high = names.length - 1;
    int mid = (low + high) / 2;

    while(low <= high) {
      if(target.equals(names[mid])) {
        return mid;
      } else if(target.compareTo(names[mid]) < 0) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
      mid = (low + high) / 2;
    }
    return -1; // not found

  }

  public static void main(String[] args) {

    String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet"};

    String target = "David1";
    
    for(int i = 0; i < names.length; i++) {
      if(target.equals(names[i])) {
        System.out.printf("%s is at index %d\n", target, i);
      }
    }
    
    int index = binarySearch(target, names);
    if(index != -1) {
      System.out.printf("%s is at index %d\n", target, index);
    } else {
      System.out.printf("%s is not in the array\n", target);
    }

    



  }
}
