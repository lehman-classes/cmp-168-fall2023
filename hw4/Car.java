class Car {

  private String make;
  private String model;

  public Car() {
    make = "Toyota";
    model = "Camry";
  }

  public Car(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public String toString() {
    return "Car";
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof Car;
  }
}
