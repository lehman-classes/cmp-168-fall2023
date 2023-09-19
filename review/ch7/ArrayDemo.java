class ArrayDemo {

  // public int sum() {
  // int[] numbers = { 12, 34, 56, 78, 90, 123, 456, 789, 0 };
  // int sum = 0;
  // for (int index = 0; index < numbers.length; index++) {
  // sum += numbers[index];
  // }
  // return sum;
  // }
  //

  public int[] copy(int[] numbers) {
    int[] copy = new int[numbers.length];

    for (int index = 0; index < numbers.length; index++) {
      copy[index] = numbers[index];
    }
    return copy;
  }

  public int sum(int[] numbers) {
    int sum = 0;

    for (int index = 0; index < numbers.length; index++) {
      // System.out.println(numbers[index]);
      sum += numbers[index];
    }

    return sum;
  }

  public double average(int[] numbers) {
    double average = 0.0;

    for (int index = 0; index < numbers.length; index++) {
      average += numbers[index];
    }

    return average / numbers.length;
  }

  public int[] resize(int[] numbers) {
    int[] newArray = new int[numbers.length * 2];

    for (int index = 0; index < numbers.length; index++) {
      newArray[index] = numbers[index];
    }
    return newArray;

  }

  public int[] swap(int[] numbers, int fromIndex, int toIndex) {
    int[] newArray = new int[numbers.length];

    int temp = numbers[fromIndex];
    numbers[fromIndex] = numbers[toIndex];
    numbers[toIndex] = temp;

    for (int index = 0; index < numbers.length; index++) {
      newArray[index] = numbers[index];
    }

    return newArray;
  }
}
