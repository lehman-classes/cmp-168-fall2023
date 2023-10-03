class App {
  public static void main(String[] args) {
    Car car1 = new Car();
    Car car2 = new Car();
    Car car3 = new Car();
    Car car4 = new Car();

    Garage garage = new Garage();
    garage.addCar(car1);
    garage.addCar(car2);
    garage.addCar(car3);
    garage.addCar(car4);
    garage.addCar("Tesla", "Model S");

    garage.printAllCars();
  }
}
