class Course implements Comparable<Course> {

  private boolean isGraduateCourse;
  private int courseNum;
  private String courseDept;
  private int numCredits;

  private int numbers[];

  public Course(boolean isGraduateCourse, int courseNumber, String courseDept, int numCredits) {
    this.isGraduateCourse = isGraduateCourse;
    this.courseNum = courseNumber;
    this.courseDept = courseDept;
    this.numCredits = numCredits;

    numbers = new int[10];
    numbers[0] = 1;
    numbers[1] = 2;
  }

  public int[] getNumbers() {

    int[] copyNumbers = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      copyNumbers[i] = numbers[i]; // copy element
    }
    return copyNumbers;
  }

  public boolean isGraduateCourse() {
    return isGraduateCourse;
  }

  public int getCourseNumber() {
    return courseNum;
  }

  public String getCourseDept() {
    return courseDept;
  }

  public int getNumCredits() {
    return numCredits;
  }

  public String getCourseName() {
    String result = "";
    if (isGraduateCourse) {
      result += "G";
    } else {
      result += "U";
    }
    result += courseDept + courseNum;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Course) {
      Course other = (Course) obj;
      return this.isGraduateCourse == other.isGraduateCourse
          && this.courseNum == other.courseNum
          && this.courseDept.equals(other.courseDept)
          && this.numCredits == other.numCredits;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return String.format("Course: %3s-%3d | Number of Credits: %02d  | Graduate/Undergraduate", courseDept, courseNum,
        numCredits, isGraduateCourse);
  }

  @Override
  public int compareTo(Course c) {
    if (this.courseNum > c.courseNum) {
      return 1;
    } else if (this.courseNum < c.courseNum) {
      return -1;
    }
    return 0;
  }

}
