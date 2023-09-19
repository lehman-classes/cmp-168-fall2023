class Test {

  public static void main(String[] args) {
    System.out.println("Testing your program");

    // Test 1 - check that the constructor works
    School school = new School(2);

    // Test 2 - check that the number of classrooms is correct
    if (school.getNumberOfClassrooms() != 0) {
      System.out.println("ERROR: The number of classrooms should be 0");
      return;
    }

    // Test 3 - add a classroom and check that the number of classrooms is correct
    school.addClassroom(100);
    if (school.getNumberOfClassrooms() != 1) {
      System.out.println("ERROR: The number of classrooms should be 1");
      return;
    }

    // Test 4 - add another classroom and check that the number of classrooms is
    // correct
    school.addClassroom(101);
    if (school.getNumberOfClassrooms() != 2) {
      System.out.println("ERROR: The number of classrooms should be 2");
      return;
    }

    // Test 5 - add one more classroom and check that the number of classrooms is
    // correct
    school.addClassroom(102);
    if (school.getNumberOfClassrooms() != 3) {
      System.out.println("ERROR: The number of classrooms should be 3");
      return;
    }

    System.out.println("All tests passed!");

  }
}
