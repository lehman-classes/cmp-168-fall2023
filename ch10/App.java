// video recording : https://youtu.be/2ZQ3f5Z

class App {

  public void vehicleHonk(Vehicle vehicle) {
    System.out.println("this vehicle honks: " + vehicle.getClass().getName());
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
