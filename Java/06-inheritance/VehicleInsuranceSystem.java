class Vehicle {
  String make;
  String model;
  int year;

  Vehicle(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  double calculateInsurance() {
    return 1000.0;
  }
}

class Car extends Vehicle {
  double carValue;

  Car(String make, String model, int year, double carValue) {
    super(make, model, year);
    this.carValue = carValue;
  }

  @Override
  double calculateInsurance() {
    return super.calculateInsurance() + (carValue * 0.05);
  }
}

class Motorcycle extends Vehicle {
  boolean isHighPerformance;

  Motorcycle(String make, String model, int year, boolean isHighPerformance) {
    super(make, model, year);
    this.isHighPerformance = isHighPerformance;
  }

  @Override
  double calculateInsurance() {
    double base = 500.0;
    return isHighPerformance ? base * 2.0 : base;
  }
}

class Truck extends Vehicle {
  double weight;
  double cargoCapacity;

  Truck(String make, String model, int year, double weight, double cargoCapacity) {
    super(make, model, year);
    this.weight = weight;
    this.cargoCapacity = cargoCapacity;
  }

  @Override
  double calculateInsurance() {
    return 2000.0 + (weight * 0.1) + (cargoCapacity * 0.2);
  }
}

public class VehicleInsuranceSystem {
  public static void main(String[] args) {
    Car car = new Car("Toyota", "Camry", 2022, 30000);
    Motorcycle bike = new Motorcycle("Yamaha", "R1", 2023, true);
    Truck truck = new Truck("Volvo", "FH16", 2020, 5000, 2000);

    System.out.println("Car Insurance: " + car.calculateInsurance());
    System.out.println("Motorcycle Insurance: " + bike.calculateInsurance());
    System.out.println("Truck Insurance: " + truck.calculateInsurance());
  }
}
