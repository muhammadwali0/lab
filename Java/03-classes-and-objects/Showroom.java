import java.time.Year;

public class Showroom {

  public static void main(String[] args) {
    Car c1 = new Car("Toyota", "Corolla", 2015, 3400000);
    c1.getDetails();
    System.out.print('\n');
    c1.applyDiscount(10);
    c1.getDetails();
    System.out.print("Is classic: " + c1.isClassic() + '\n');
  }

}

class Car {
  String make;
  String model;
  int year;
  double price;

  Car(String make, String model, int year, double price) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.price = price;
  }

  void getDetails() {
    System.out.print("Make: " + make + "\nModel: " + model + "\nYear: " + year + "\nPrice: " + price + " PKR\n");
  }

  void applyDiscount(int percentage) {
    price -= (price * percentage / 100.0);
  }

  boolean isClassic() {
    return year < (Year.now().getValue() - 20);
  }

}
