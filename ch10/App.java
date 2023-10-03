class App {

  public void vehicleHonk(Vehicle vehicle) {
    vehicle.honk();
  }

  public static void main(String[] args) {
    // Vehicle vehicle = new Vehicle();
    App app = new App();
    Car car = new Car();
    Bus bus = new Bus();
    Truck truck = new Truck();
    app.vehicleHonk(car);
    app.vehicleHonk(bus);
    app.vehicleHonk(truck);

  }
}
