class App {
  public static void main(String[] args) {

    // create an instance of ArrayDemo
    ArrayDemo arrayDemo = new ArrayDemo();

    int[] values = { 12, 34, 78, 90, 123, 456, 789, 0 };

    System.out.println("index[0] = " + values[0]);
    System.out.println("index[7] = " + values[7]);

    // swap
    values = arrayDemo.swap(values, 0, 7);

    System.out.println("index[0] = " + values[0]);
    System.out.println("index[7] = " + values[7]);

    // System.out.println(values[0]);
    // System.out.println(values[1]);
    // System.out.println(values[2]);

    int[] copyVersion = arrayDemo.copy(values);
    // call the sum method on the arrayDemo instance
    int sum = arrayDemo.sum(values);
    System.out.println("Sum: " + sum);

    // sum copyVersion
    sum = arrayDemo.sum(copyVersion);
    System.out.println("copyVersion Sum: " + sum);

    sum = arrayDemo.sum(new int[] { 1, 2, 3, 4, 5 });
    System.out.println("Sum: " + sum);

    // call the average method on the arrayDemo instance
    double average = arrayDemo.average(values);
    System.out.println("Average: " + average);

    // call the sum method on the arrayDemo instance
    // int sum2 = arrayDemo.sum();
    // System.out.println("Sum: " + sum2);

    // call the resize method on the arrayDemo instance
    int[] newArray = arrayDemo.resize(values);
    System.out.println("newArray length: " + newArray.length);
    System.out.println("newArray[0]: " + newArray[0]); // 12
  }
}
