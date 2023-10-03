class Garage {
  private Car[] cars;
  private int currentIndex;

  public Garage() {
    currentIndex = 0;
    cars = new Car[3];
  }

  public Garage(int numCars) {
    currentIndex = 0;
    cars = new Car[numCars];
  }

  private void resizeArray() {
    // check if we need to resize the array
    if (currentIndex == cars.length) {
      // create a new array with double the size
      Car[] newCars = new Car[cars.length * 2];
      // copy the old array to the new array
      for (int i = 0; i < cars.length; i++) {
        newCars[i] = cars[i];
      }
      // assign the new array to the old array
      cars = newCars;
    }
  }

  public void printAllCars() {
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i].getMake() + " " + cars[i].getModel());
    }
  }

  public void addCar(String make, String model) {

    // System.out.println(cars[currentIndex - 1].getMake());
    // cars[currentIndex].setMake(make);
    // cars[currentIndex].setModel(model);
    cars[currentIndex] = new Car(make, model);
    currentIndex++;
  }

  public void addCar(Car car) {
    // you must know what's the latest index
    cars[currentIndex] = car;
    currentIndex++;
    resizeArray();
  }

  public void printCar(int index) {
    System.out.println(cars[index]);
  }
}
