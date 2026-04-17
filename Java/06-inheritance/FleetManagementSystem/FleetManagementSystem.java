public class FleetManagementSystem {

  public static void main(String[] args) {
    Sedan sedan1 = new Sedan("Toyota", "Corolla", 2022, 4);
    CargoTruck cg1 = new CargoTruck("Volvo", "FH16", 2020, 25.5);

    System.out.println(sedan1.displayDetails());
    System.out.println();
    System.out.println(cg1.displayDetails());

  }

}

class Vehicle {
  private String manufacturer;
  private String model;
  protected int manufacturingYear;

  Vehicle(String manufacturer, String model, int manufacturingYear) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.manufacturingYear = manufacturingYear;
  }

  String displayDetails() {
    return "Manufacturer: " + manufacturer + "\nModel: " + model + "\nYear: " + manufacturingYear + "\n";
  }

}

class Sedan extends Vehicle {
  private int numberOfDoors;

  Sedan(String manufacturer, String model, int manufacturingYear, int numberOfDoors) {
    super(manufacturer, model, manufacturingYear);
    this.numberOfDoors = numberOfDoors;
  }

  @Override
  String displayDetails() {
    return super.displayDetails() + "Number of Doors: " + numberOfDoors;
  }

}

class CargoTruck extends Vehicle {
  private double cargoCapacity;

  CargoTruck(String manufacturer, String model, int manufacturingYear, double cargoCapacity) {
    super(manufacturer, model, manufacturingYear);
    this.cargoCapacity = cargoCapacity;
  }

  @Override
  String displayDetails() {
    return super.displayDetails() + "Cargo Capacity: " + cargoCapacity;
  }

}
