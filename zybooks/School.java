class School {
  private int[] classrooms;

  private int currentIndexOfClassroom;

  // constructor
  School(int numberOfPossibleClassrooms) {
    classrooms = new int[numberOfPossibleClassrooms];
    currentIndexOfClassroom = 0;
  }

  // getters
  int getNumberOfClassrooms() {
    // System.out.println("currentIndexOfClassroom: " +
    // this.currentIndexOfClassroom);
    return this.currentIndexOfClassroom;
  }

  void addClassroom(int classroomNumber) {
    // this code will eventually fail if we add more classrooms than the
    // numberOfPossibleClassrooms

    // before adding a classroom, check that we have space
    if (this.currentIndexOfClassroom >= this.classrooms.length) {
      // resize the array here
    }
    classrooms[this.currentIndexOfClassroom] = classroomNumber;
    this.currentIndexOfClassroom++;
  }
}
