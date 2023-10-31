class App {

  public static void displayArray(String[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
      System.out.printf("row[%d] : ", row);
      for (int col = 0; col < matrix[row].length; col++) {
        System.out.printf("%s\t", matrix[row][col]);
      }
      System.out.println();
    }
  }

  public static void displayArray(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
      System.out.printf("row[%d] : ", row);
      for (int col = 0; col < matrix[row].length; col++) {
        System.out.printf("%d\t", matrix[row][col]);
      }
      System.out.println();
    }
  }

  public static String[][] getPopulatedArray(int rows, int cols) {
    String[][] matrix = new String[rows][cols];
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = String.format("[%d][%d]", row, col);
      }
    }

    return matrix;
  }

  public static void main(String[] args) {

    // Arrays - One dimensional

    // creating an array with values
    int[] numbers2 = { 1, 2, 3, 4, 5 }; // new int[5]

    int[] numbers = new int[5]; // created an array with 0s by default
    numbers[0] = 1; // and then, we set the values for each element of the array
    numbers[1] = 2;
    numbers[2] = 3;
    numbers[3] = 4;
    numbers[4] = 5;
    // arrays are organized by index
    // index starts at 0
    // to access an element in an array, use the index
    // System.out.println(numbers[0]);
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    for (int element : numbers) {
      System.out.println(element);
    }

    // some kind of data structure, where you can store multiple values
    // in memory it will be stored in a contiguous block of memory
    // [32-bits][32-bits][32-bits][32-bits][32-bits]

    String[] names = new String[5];
    names[0] = "John";
    names[1] = "Janette";
    names[2] = "Jenny";
    names[3] = "Jillian";
    names[4] = "Jasmineaskdjfklasjdklfaklsdf";

    // [32-bits/reference address][32-bits/reference
    // address][32-bits...][32-bits...][32-bits....]
    // reference address is a pointer to the actual value in memory in the heap
    // the reference address is stored in the stack
    // ["John"] on some diff part of the heap... ["Janette"].... some other part of
    // the heap ["Jenny"]...
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    // we can have an array of any type... primitive or reference but not both in
    // the same array
    // however, we can have multiple reference types in the same array
    Object[] objects = new Object[5];
    objects[0] = "John"; // new String("John");
    objects[1] = 1; // new Integer(1);
    objects[2] = 1.0; // new Double(1.0);
    objects[3] = true; // new Boolean(true);
    objects[4] = 'a'; // new Character('a');
    for (int i = 0; i < objects.length; i++) {
      System.out.println(objects[i].getClass().getSimpleName());
    }

    // Two dimensional arrays
    int[][] matrix = new int[2][3];
    matrix[0][0] = 1;
    matrix[0][1] = 2;
    matrix[0][2] = 3;
    matrix[1][0] = 4;
    matrix[1][1] = 5;
    matrix[1][2] = 6;
    displayArray(matrix);

    // two dimensional array with values
    int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 } };
    System.out.printf("first index: matrix2[0][0]) : %d\n", matrix2[0][0]);
    System.out.printf("last index: matrix2[1][2]) : %d\n", matrix2[1][2]);
    // System.out.printf("Index Out of Range : matrix2[-1][2]) : %d\n",
    // matrix2[-1][2]);

    // some kind of data structure, where you can store multiple values
    // looks like a table
    // each row with different number of columns
    int[] row1 = { 1, 2, 3 };
    int[] row2 = { 4 };
    int[][] matrix3 = { row1, row2 };
    displayArray(matrix3);

    String[][] scores = {
        { "John", "100" },
        { "Janette", "90" },
        { "Jenny", "80" },
        { "Jillian", "70" },
        { "Jasmine", "60" }
    };
    displayArray(scores);

    String[][] matrix4 = getPopulatedArray(3, 5);
    displayArray(matrix4);

  }
}
